package org.joo.libra.sql.node;

import java.math.BigDecimal;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasValue;
import org.joo.libra.sql.antlr.SqlLexer;

public class MathExpressionNode extends AbstractBinaryOpExpressionNode<HasValue<Number>> implements HasValue<Number> {

	@Override
	public Predicate buildPredicate() {
		return null;
	}

	@Override
	public Number getValue(PredicateContext context) {
		double left = getLeft().getValue(context).doubleValue();
		double right = getRight().getValue(context).doubleValue();
		switch(getOp()) {
		case SqlLexer.PLUS:
			return left + right;
		case SqlLexer.MINUS:
			return left - right;
		case SqlLexer.TIMES:
			return new BigDecimal(left).multiply(new BigDecimal(right));
		case SqlLexer.DIVIDE:
			return new BigDecimal(left).divide(new BigDecimal(right));
		}
		return null;
	}
}