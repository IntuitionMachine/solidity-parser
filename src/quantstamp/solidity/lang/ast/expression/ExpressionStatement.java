package quantstamp.solidity.lang.ast.expression;

public final class ExpressionStatement extends Expression {
  public Expression expr;

  public ExpressionStatement(final Expression expr) {
    this.expr = expr;
  }

  @Override
  public String toString() {
    return expr.toString();
  }
}
