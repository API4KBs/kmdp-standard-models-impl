package edu.mayo.kmdp.terms.adapters.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import org.omg.spec.api4kp._1_0.identifiers.ConceptIdentifier;

public interface LegacyConceptIdentifierTermsJsonAdapter {

  class Serializer
      extends LegacyAbstractTermsJsonAdapter.AbstractSerializer<ConceptIdentifier> {
    @Override
    public void serialize(ConceptIdentifier v, JsonGenerator gen, SerializerProvider serializers)
        throws IOException {
      gen.writeObject(v);
    }

  }

  class Deserializer
      extends LegacyAbstractTermsJsonAdapter.AbstractDeserializer<ConceptIdentifier> {

    @Override
    public ConceptIdentifier deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException {
      TreeNode t = jp.readValueAsTree();
      return parseAsConceptIdentifier(t);
    }

    @Override
    protected ConceptIdentifier[] getValues() {
      return new ConceptIdentifier[0];
    }

    @Override
    protected ConceptIdentifier resolveGeneric(TreeNode t) {
      return parseAsConceptIdentifier(t);
    }

  }

}