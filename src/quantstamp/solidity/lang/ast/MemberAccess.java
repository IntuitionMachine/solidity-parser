package quantstamp.solidity.lang.ast;

import quantstamp.solidity.lang.ast.expression.Expression;

// MemberAccess = Expression '.' Identifier

public final class MemberAccess extends Node {
  public final Expression expr;
  public final Identifier id;

  public MemberAccess(final Expression expr, final Identifier id) {
    this.expr = expr;
    this.id = id;
  }

  @Override
  public String toString() {
    return expr + "." + id;
  }
}
