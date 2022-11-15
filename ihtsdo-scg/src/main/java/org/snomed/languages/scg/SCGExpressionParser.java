package org.snomed.languages.scg;

import grammar.SCGBaseListener;
import grammar.SCGLexer;
import grammar.SCGParser;
import grammar.SCGParser.AttributeContext;
import grammar.SCGParser.AttributegroupContext;
import grammar.SCGParser.ConceptreferenceContext;
import grammar.SCGParser.DefinitionstatusContext;
import grammar.SCGParser.ExpressionContext;
import grammar.SCGParser.ExpressionvalueContext;
import grammar.SCGParser.SubexpressionContext;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.snomed.languages.scg.domain.model.DefinitionStatus;
import org.snomed.languages.scg.domain.model.SCGAttribute;
import org.snomed.languages.scg.domain.model.SCGAttributeGroup;
import org.snomed.languages.scg.domain.model.SCGAttributeValue;
import org.snomed.languages.scg.domain.model.SCGExpression;
import org.snomed.languages.scg.domain.model.SCGTerm;

public class SCGExpressionParser {

  private final SCGObjectFactory scgObjectFactory;

  public SCGExpressionParser(SCGObjectFactory scgObjectFactory) {
    this.scgObjectFactory = scgObjectFactory;
  }

  public SCGExpressionParser() {
    this(new SCGObjectFactory());
  }

  public SCGExpression abstractExpression(String scg) throws SCGException {
    return abstractExpression(parseExpression(scg));
  }

  public SCGExpression abstractExpression(ExpressionContext sctx) throws SCGException {
    final ParseTreeWalker walker = new ParseTreeWalker();
    final SCGListenerImpl listener = new SCGListenerImpl(scgObjectFactory);
    walker.walk(listener, sctx);

    return listener.getExpression();
  }

  public ExpressionContext parseExpression(String scg) throws SCGException {

    final SCGLexer lexer = new SCGLexer(CharStreams.fromString(scg));
    final SCGParser parser = new SCGParser(new CommonTokenStream(lexer));
    parser.addErrorListener(new SCGParserErrorListener());

    return parser.expression();
  }


  private static class SCGListenerImpl extends SCGBaseListener {

    private final SCGObjectFactory scgObjectFactory;
    private SCGExpression rootExpression;

    public SCGListenerImpl(SCGObjectFactory scgObjectFactory) {
      this.scgObjectFactory = scgObjectFactory;
    }

    @Override
    public void enterExpression(ExpressionContext ctx) {
      SCGExpression expression = build(ctx);
      if (rootExpression == null) {
        rootExpression = expression;
      }
    }

    private SCGExpression build(ExpressionContext ctx) {
      SCGExpression root = null;
      if (ctx.definitionstatus() != null) {
        root = build(ctx.definitionstatus());
      }
      if (ctx.subexpression() != null) {
        SCGExpression expression = build(ctx.subexpression());
        if (root != null) {
          expression.setDefinitionStatus(root.getDefinitionStatus());
        }
        root = expression;
      }
      return root;
    }

    public SCGExpression build(DefinitionstatusContext ctx) {
      SCGExpression expression = scgObjectFactory.getExpression();
      expression.setDefinitionStatus(DefinitionStatus.textLookup(ctx.getText()));
      return expression;
    }

    public SCGExpression build(SubexpressionContext ctx) {
      SCGExpression expression = scgObjectFactory.getExpression();
      if (ctx.focusconcept() != null) {
        if (ctx.focusconcept().conceptreference() != null) {
          List<SCGTerm> conceptIds = ctx.focusconcept()
              .conceptreference()
              .stream()
              .map(c -> toSCGTerm(c))
              .collect(Collectors.toList());
          expression.setFocusConcepts(conceptIds);
        }
      }

      if (ctx.refinement() != null) {
        if (ctx.refinement().attributegroup() != null
            && !ctx.refinement().attributegroup().isEmpty()) {
          Set<SCGAttributeGroup> groups = ctx.refinement()
              .attributegroup()
              .stream()
              .map(this::mapAttributeGroup)
              .collect(Collectors.toSet());
          expression.setAttributeGroups(groups);
        }

        if (ctx.refinement().attributeset() != null) {
          if (ctx.refinement().attributeset().attribute() != null) {
            List<SCGAttribute> attributes = ctx.refinement()
                .attributeset()
                .attribute()
                .stream()
                .map(this::mapAttributes)
                .collect(Collectors.toList());
            expression.setAttributes(attributes);
          }
        }
      }
      return expression;
    }

    private SCGTerm toSCGTerm(ConceptreferenceContext crc) {
      var code = crc.conceptid().getText();
      var label = Optional.ofNullable(crc.term())
          .map(RuleContext::getText).orElse(null);
      return new SCGTerm(code, label);
    }

    private SCGAttribute mapAttributes(AttributeContext ctx) {
      SCGAttribute attribute = new SCGAttribute();
      ConceptreferenceContext conceptreference = ctx.attributename().conceptreference();
      if (conceptreference != null && conceptreference.conceptid() != null) {
        attribute.setProperty(toSCGTerm(conceptreference));
      }

      ExpressionvalueContext expressionvalue = ctx.attributevalue().expressionvalue();
      if (expressionvalue != null) {
        SCGAttributeValue value = scgObjectFactory.getAttributeValue();
        if (expressionvalue.subexpression() != null) {
          value.setConceptExpression(build(expressionvalue.subexpression()));
        }

        if (expressionvalue.conceptreference() != null) {
          value.setConcept(toSCGTerm(expressionvalue.conceptreference()));
        }
        attribute.setAttributeValue(value);
      }
      return attribute;
    }

    private SCGAttributeGroup mapAttributeGroup(AttributegroupContext ctx) {
      if (ctx.attributeset() != null) {
        SCGAttributeGroup group = scgObjectFactory.getAttributeGroup();
        if (ctx.attributeset().attribute() != null) {
          List<SCGAttribute> attributes = ctx.attributeset()
              .attribute()
              .stream()
              .map(this::mapAttributes)
              .collect(Collectors.toList());
          group.setAttributes(attributes);
        }
        return group;
      }
      return null;
    }

    public SCGExpression getExpression() {
      return rootExpression;
    }
  }
}