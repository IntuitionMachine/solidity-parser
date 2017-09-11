package quantstamp.solidity.lang.ast;

import java.util.List;

import quantstamp.solidity.lang.ast.expression.Expression;

// ExpressionList = Expression ( ',' Expression )*

public final class ExpressionList extends Node {
  public final List<Expression> exprList;

  public ExpressionList(List<Expression> exprList) {
    this.exprList = exprList;
  }
}
