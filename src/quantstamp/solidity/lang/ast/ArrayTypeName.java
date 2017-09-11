package quantstamp.solidity.lang.ast;

import quantstamp.solidity.lang.ast.expression.Expression;

// ArrayTypeName = TypeName '[' Expression? ']'

public final class ArrayTypeName extends Node {
  public final TypeName typeName;
  public final Expression expr;

  public ArrayTypeName(final TypeName typeName, final Expression expression) {
    this.expr = expression;
    this.typeName = typeName;
  }

  @Override
  public String toString() {
    return typeName + "[" + expr + "]";
  }
}
