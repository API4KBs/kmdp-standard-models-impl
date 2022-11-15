package org.snomed.languages.scg.domain.model;

import java.util.List;
import java.util.stream.Collectors;

public class SCGAttributeGroup implements Refinement {

	private List<SCGAttribute> attributes;
	
	public List<SCGAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<SCGAttribute> attributes) {
		this.attributes = attributes;
	}


	@Override
	public String toString() {
		return toString(false);
	}

	public String toFullString() {
		return toString(true);
	}

	public String toString(boolean withLabels) {
		StringBuilder builder = new StringBuilder();
		builder.append("{ ");

		var atts = getAttributes().stream()
				.map(attr -> attr.toString(withLabels))
				.collect(Collectors.joining(", "));
		builder.append(atts);

		builder.append(" }");
		return builder.toString();
	}
	
	
}
