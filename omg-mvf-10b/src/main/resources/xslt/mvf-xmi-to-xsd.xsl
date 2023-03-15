<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:xmi="http://www.omg.org/spec/XMI/20131001"
  xmlns:xs="http://www.w3.org/2001/XMLSchema"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xmlns:uml="http://www.omg.org/spec/UML/20131001"
  xmlns:xmi2xsd="http://www.mayo.edu/kmdp/xmi2xsd"
  xsi:schemaLocation="http://www.w3.org/1999/XSL/Transform
                                    https://www.w3.org/TR/xslt-30/schema-for-xslt30.xsd"
  xmi:version="2.5" version="3.0">

  <xsl:output method="xml" indent="yes"/>

  <xsl:param name="MVF_NS" select="'https://www.omg.org/spec/MVF/20220702/MODEL'"/>

  <xsl:template match="text() | @*"/>

  <xsl:template match="/">
    <xsl:apply-templates/>
  </xsl:template>


  <xsl:template match="/xmi:XMI/uml:Model">
    <xsl:call-template name="xsdSchema"/>
  </xsl:template>

  <xsl:template name="xsdSchema">

    <xsl:element name="xs:schema">
      <xsl:attribute name="elementFormDefault">qualified</xsl:attribute>
      <xsl:attribute name="targetNamespace" select="$MVF_NS"/>
      <xsl:namespace name="xmi">http://www.omg.org/spec/XMI/20131001</xsl:namespace>
      <xsl:namespace name="mvf" select="$MVF_NS"/>


      <xsl:for-each select="packagedElement[@xmi:type='uml:Package']">
        <!-- Process Elements -->
        <xsl:call-template name="types">
          <xsl:with-param name="root" select="."/>
        </xsl:call-template>

      </xsl:for-each>

    </xsl:element>

  </xsl:template>


  <xsl:template name="types">
    <xsl:param name="root"/>

    <xsl:for-each
      select="$root/packagedElement[@xmi:type = 'uml:Class']">
      <xsl:if test="not(@name='anyURI')">
        <xsl:call-template name="namedElement"/>
        <xsl:call-template name="complexType"/>
      </xsl:if>
    </xsl:for-each>

  </xsl:template>


  <xsl:template name="namedElement">
    <xsl:element name="xs:element">
      <xsl:attribute name="name">
        <xsl:value-of select="concat(lower-case(substring(@name, 1, 1)), substring(@name, 2))"/>
      </xsl:attribute>

      <xsl:attribute name="type">
        <xsl:value-of select="concat('mvf:',@name)"/>
      </xsl:attribute>
    </xsl:element>
  </xsl:template>

  <!-- Complex types: check inheritance, then generate class content -->

  <xsl:template name="complexType">
    <xsl:element name="xs:complexType">
      <xsl:copy-of select="@xmi:id"/>

      <xsl:attribute name="name">
        <xsl:value-of select="@name"/>
      </xsl:attribute>

      <xsl:if test="./@isAbstract = 'true'">
        <xsl:attribute name="abstract">
          <xsl:value-of select="true()"/>
        </xsl:attribute>
      </xsl:if>


      <xsl:choose>
        <xsl:when
          test="
            //packagedElement[@xmi:id = current()/generalization/@general
            and (@xmi:type = 'uml:Class' or @xmi:type = 'uml:DataType')]">

          <xsl:variable name="parentId" select="generalization/@general"/>
          <xsl:element name="xs:complexContent">
            <xsl:element name="xs:extension">
              <xsl:call-template name="injectType">
                <xsl:with-param name="type" select="xmi2xsd:resolveType(., $parentId)"/>
                <xsl:with-param name="typeAttr">base</xsl:with-param>
              </xsl:call-template>

              <xsl:call-template name="processElements"/>
            </xsl:element>
          </xsl:element>
        </xsl:when>

        <xsl:otherwise>
          <xsl:call-template name="processElements"/>
        </xsl:otherwise>

      </xsl:choose>
    </xsl:element>
  </xsl:template>

  <xsl:template name="injectType">
    <xsl:param name="type" as="xs:QName"/>
    <xsl:param name="typeAttr"/>

    <!--    <xsl:choose>-->
    <!--      <xsl:when test="namespace-uri-from-QName($type)">-->
    <!--        <xsl:namespace name="tns" select="namespace-uri-from-QName($type)"/>-->
    <!--        <xsl:attribute name="{$typeAttr}">-->
    <!--          <xsl:value-of select="concat('tns:', local-name-from-QName($type))"/>-->
    <!--        </xsl:attribute>-->
    <!--      </xsl:when>-->
    <!--      <xsl:otherwise>-->
    <!--        <xsl:attribute name="{$typeAttr}">-->
    <!--          <xsl:value-of select="local-name-from-QName($type)"/>-->
    <!--        </xsl:attribute>-->
    <!--      </xsl:otherwise>-->
    <!--    </xsl:choose>-->


    <xsl:attribute name="{$typeAttr}">
      <xsl:value-of
        select="concat(xmi2xsd:mapPrefix(namespace-uri-from-QName($type)),':', local-name-from-QName($type))"/>
    </xsl:attribute>
  </xsl:template>


  <!-- Elements derive from associations and non-primitive UML attributes -->
  <xsl:template name="processElements">
    <xsl:element name="xs:sequence">
      <xsl:call-template name="processComplexAttributes"/>
    </xsl:element>
  </xsl:template>


  <!-- Datatype attributes -->
  <xsl:template name="processComplexAttributes">
    <xsl:for-each select="ownedAttribute">

      <xsl:if test="not(./type[@xmi:type = 'uml:PrimitiveType'])">
        <xsl:element name="xs:element">
          <xsl:attribute name="name">
            <xsl:value-of select="@name"/>
          </xsl:attribute>
          <xsl:call-template name="elementCardinality"/>
          <xsl:call-template name="elementType"/>
        </xsl:element>

      </xsl:if>

    </xsl:for-each>
  </xsl:template>


  <xsl:template name="elementCardinality">
    <xsl:attribute name="minOccurs">
      <xsl:choose>
        <xsl:when test="not(./lowerValue) or ./lowerValue[not(@value)]">0</xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="./lowerValue/@value"/>
        </xsl:otherwise>
      </xsl:choose>
    </xsl:attribute>
    <xsl:if test="not(./upperValue/@value = '1') and ./upperValue">
      <xsl:attribute name="maxOccurs">
        <xsl:choose>
          <xsl:when test="not(./upperValue) or ./upperValue[not(@value)]">1</xsl:when>
          <xsl:when test="./upperValue[@value = '*']">unbounded</xsl:when>
          <xsl:otherwise>
            <xsl:value-of select="./upperValue/@value"/>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
    </xsl:if>
  </xsl:template>

  <xsl:template name="elementType">

    <xsl:choose>
      <xsl:when
        test="./type[@href] and starts-with(./type/@href,'http://www.omg.org/spec/UML/20131001/PrimitiveTypes.xmi')">

        <xsl:call-template name="injectType">
          <xsl:with-param name="type" select="xmi2xsd:resolvePrimitive(./type/@href)"/>
          <xsl:with-param name="typeAttr" select="'type'"/>
        </xsl:call-template>
      </xsl:when>

      <xsl:when test="@type">

        <xsl:call-template name="injectType">
          <xsl:with-param name="type" select="xmi2xsd:resolveType(., @type)"/>
          <xsl:with-param name="typeAttr" select="'type'"/>
        </xsl:call-template>
      </xsl:when>

      <xsl:otherwise>
        <xsl:message terminate="yes">Unknown element type on <xsl:value-of select="local-name()"/></xsl:message>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>


  <xsl:function name="xmi2xsd:resolvePrimitive" as="xs:QName">
    <xsl:param name="primitiveType" as="xs:string"/>
    <xsl:variable name="simpleType">
      <xsl:choose>
        <xsl:when
          test="$primitiveType = 'http://www.omg.org/spec/UML/20131001/PrimitiveTypes.xmi#String'"
        >xs:string</xsl:when>
        <xsl:when
          test="$primitiveType = 'http://www.omg.org/spec/UML/20131001/PrimitiveTypes.xmi#Boolean'"
        >xs:boolean</xsl:when>
        <xsl:when
          test="$primitiveType = 'http://www.omg.org/spec/UML/20131001/PrimitiveTypes.xmi#Integer'"
        >xs:int</xsl:when>
        <xsl:when
          test="$primitiveType = 'DateTime'">xs:dateTime</xsl:when>
        <xsl:when
          test="$primitiveType = 'URI'">xs:anyURI</xsl:when>
        <xsl:when
          test="$primitiveType = 'URL'">xs:anyURI</xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="substring($primitiveType, index-of($primitiveType,'#'))"/>
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:sequence select="QName('http://www.w3.org/2001/XMLSchema',$simpleType)"/>
  </xsl:function>


  <xsl:function name="xmi2xsd:resolveType" as="xs:QName">
    <xsl:param name="typedElement" as="node()"/>
    <xsl:param name="typeId" as="xs:string"/>

        <xsl:variable name="resolvedType"
          select="xmi2xsd:resolveQualifiedInternalType($typedElement, $typeId)"/>
        <xsl:choose>
          <xsl:when test="local-name-from-QName($resolvedType)='anyURI'">
            <xsl:sequence select="QName( 'http://www.w3.org/2001/XMLSchema' , 'xs:anyURI' )"/>
          </xsl:when>
          <xsl:otherwise>
            <xsl:sequence select="$resolvedType"/>
          </xsl:otherwise>
        </xsl:choose>
  </xsl:function>

  <xsl:function name="xmi2xsd:resolveQualifiedInternalType" as="xs:QName">
    <xsl:param name="context" as="node()?"/>
    <xsl:param name="typeId" as="xs:string"/>

    <xsl:variable name="type" select="root($context)//packagedElement[@xmi:id = $typeId]"/>
    <xsl:variable name="typeNs" as="xs:string?"
      select="$type/ancestor::packagedElement[@xmi:type = 'uml:Package'][1]/@URI"/>
    <xsl:variable name="typeName" as="xs:string" select="$type/@name"/>

    <xsl:sequence select="QName($typeNs, concat(xmi2xsd:mapPrefix($typeNs), ':', $typeName))"/>
  </xsl:function>

  <xsl:function name="xmi2xsd:mapPrefix" as="xs:string">
    <xsl:param name="namesp" as="xs:string"/>
    <xsl:choose>
      <xsl:when test="$namesp = 'https://www.omg.org/spec/MVF'">mvf</xsl:when>
      <xsl:when test="$namesp = 'http://www.w3.org/2001/XMLSchema'">xs</xsl:when>
      <xsl:otherwise>UNKNOWN</xsl:otherwise>
    </xsl:choose>
  </xsl:function>

</xsl:stylesheet>
