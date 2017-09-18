package quantstamp.solidity.lang.ast.expression;

// IndexAccess = Expression '[' Expression? ']'

public final class IndexAccess extends Expression {
  public final Expression expr1;
  public final Expression expr2;

  public IndexAccess(final Expression expr) {
    this.expr1 = expr;
    this.expr2 = null;
  }

  public IndexAccess(final Expression expr1, final Expression expr2) {
    this.expr1 = expr1;
    this.expr2 = expr2;
  }

  @Override
  public String toString() {
    if (expr2 == null) {
      return expr1 + "[]";
    } else {
      return expr1 + "[" + expr2 + "]";
    }
  }
}
