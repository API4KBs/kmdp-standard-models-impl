<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:xs="http://www.w3.org/2001/XMLSchema"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xmlns:sp="http://kmdp.mayo.edu/ccg/serviceprofile"
  xmlns="http://www.w3.org/1999/xhtml"
  exclude-result-prefixes="xs"
  version="2.0">

  <xsl:template match="text()"><xsl:value-of select="normalize-space(.)"/></xsl:template>

  <xsl:template match="/sp:serviceProfile">
    <html>
      <head>
        <title><xsl:value-of select="@serviceName"/></title>
      </head>
      <body>
        <h1><xsl:value-of select="sp:serviceCategory/@label"/></h1>
        <p>Concept ID: <a href="{sp:serviceCategory/@code}"><xsl:value-of select="sp:getFragment(sp:serviceCategory/@code,'#')"/></a></p>
        <xsl:for-each select="sp:serviceParameters">
          <p><a href="{@sParameter}"><xsl:value-of select="sp:getFragment(@sParameter,'#')"/></a> : <xsl:value-of select="@serviceParameterName"/></p>
        </xsl:for-each>
        <h2>Service Profile</h2>
        <p>ID: <a href="{@id}"><xsl:value-of select="sp:getFragment(string(@id),'/')"/></a></p>
        <h2>Base Service:</h2>
        <xsl:call-template name="baseService">
          <xsl:with-param name="api" select="sp:presentedBy"/>
        </xsl:call-template>
        <h2>Bindings</h2>
        <xsl:call-template name="bindings"/>
      </body>
    </html>
  </xsl:template>

  <xsl:template name="baseService">
    <xsl:param name="api" as="node()"/>
    <table>
      <tbody>
        <tr>
          <td><em><strong>Spec</strong></em></td>
          <td><xsl:value-of select="sp:getSeries( $api/@id )"/></td>
        </tr>
        <tr>
          <td><em><strong>Version</strong></em></td>
          <td><xsl:value-of select="sp:getVersion( $api/@id )"/></td>
        </tr>
        <tr>
          <td><em><strong>Endpoint</strong></em></td>
          <td><xsl:value-of select="sp:getFragment( $api/@id, '#' )"/></td>
        </tr>
        <tr>
          <td><em><strong>URI</strong></em></td>
          <td><xsl:value-of select="$api/@id"/></td>
        </tr>
      </tbody>
    </table>
  </xsl:template>

  <xsl:template name="bindings">
    <table>
      <thead>
        <tr style="text-align: center;">
          <th>Parameter</th>
          <th>Type</th>
          <th>Value</th>
          <th>Language</th>
          <th>Variables</th>
        </tr>
      </thead>
      <tbody>
        <xsl:for-each select="sp:hasBinding">
          <xsl:call-template name="binding"/>
        </xsl:for-each>
      </tbody>
    </table>
  </xsl:template>

  <xsl:template name="binding">
    <xsl:variable name="param" select="@toParam"/>
    <xsl:choose>
      <xsl:when test="@xsi:type='sp:LiteralBinding'">
        <tr>
          <td><a href="{$param}"><xsl:value-of select="sp:getFragment( $param, 'parameters/' )"/></a></td>
          <td>Literal</td>
          <td><xsl:value-of select="@valueData"/></td>
          <td>N/A</td>
          <td>N/A</td>
        </tr>
      </xsl:when>
      <xsl:when test="@xsi:type='sp:ExpressionBinding'">
        <tr>
          <td><a href="{$param}"><xsl:value-of select="sp:getFragment( $param, 'parameters/' )"/></a></td>
          <td>Expression</td>
          <td><xsl:value-of select="sp:expression/@theExpr"/></td>
          <td><xsl:value-of select="sp:expression/@expressionLanguage"/></td>
          <td>
            <ul>
              <xsl:for-each select="sp:expression/sp:variableBinding">
                <li><a href="{@theObject}"><xsl:value-of select="@theVar"/></a></li>
              </xsl:for-each>
            </ul>
          </td>
        </tr>
      </xsl:when>
      <xsl:otherwise>
        <tr>
          <td>N/A</td>
          <td>N/A</td>
          <td>N/A</td>
          <td>N/A</td>
          <td>N/A</td>
        </tr>
      </xsl:otherwise>
    </xsl:choose>

  </xsl:template>

  <xsl:function name="sp:getSeries" as="xs:string">
    <xsl:param name="vuri" as="xs:anyURI"/>
    <xsl:variable name="base" select="substring-before( $vuri, '#' )" />
    <xsl:choose>
      <xsl:when test="matches( $base, '.*/versions/.*' )">
        <xsl:variable name="series" select="substring-before( $base, '/versions/' )"/>
        <xsl:sequence select="sp:getFragment( $series, '/' )" />
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$base"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:function>

  <xsl:function name="sp:getVersion" as="xs:string">
    <xsl:param name="vuri" as="xs:anyURI"/>
    <xsl:variable name="base" select="substring-before( $vuri, '#' )" />
    <xsl:choose>
      <xsl:when test="matches( $base, '.*/versions/.*' )">
        <xsl:sequence select="substring-after( $base, 'versions/' )" />
      </xsl:when>
      <xsl:otherwise>N/A</xsl:otherwise>
    </xsl:choose>
  </xsl:function>

  <xsl:function name="sp:getFragment" as="xs:string">
    <xsl:param name="txt" as="xs:string"/>
    <xsl:param name="sep" as="xs:string"/>
    <xsl:variable name="tokens" select="tokenize( $txt, $sep )"/>
    <xsl:value-of select="$tokens[last()]" />
  </xsl:function>

</xsl:stylesheet>