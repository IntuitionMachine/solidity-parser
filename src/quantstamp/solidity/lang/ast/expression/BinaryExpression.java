package quantstamp.solidity.lang.ast.expression;

public abstract class BinaryExpression extends Expression {
  public final Expression left;
  public final Expression right;

  public BinaryExpression(final Expression left, final Expression right) {
    this.left = left;
    this.right = right;
  }
}
