package org.joo.libra.sql.node;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasList;
import org.joo.libra.common.HasValue;

import lombok.Data;

@Data
public class ListItemExpressionNode implements ExpressionNode, HasList {

	private List<ExpressionNode> innerNode = new ArrayList<>();

	@Override
	public Predicate buildPredicate() {
		return null;
	}

	public Collection<?> getValue(final PredicateContext context) {
		return innerNode.stream().map(node -> ((HasValue<?>) node).getValue(context)).collect(Collectors.toList());
	}

	public Object[] getValueAsArray(final PredicateContext context) {
		return innerNode.stream().map(node -> ((HasValue<?>) node).getValue(context)).toArray();
	}
}
