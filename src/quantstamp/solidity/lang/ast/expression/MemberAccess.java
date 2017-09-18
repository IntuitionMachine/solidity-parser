package quantstamp.solidity.lang.ast.expression;

import quantstamp.solidity.lang.ast.Identifier;

// MemberAccess = Expression '.' Identifier

public final class MemberAccess extends Expression {
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
