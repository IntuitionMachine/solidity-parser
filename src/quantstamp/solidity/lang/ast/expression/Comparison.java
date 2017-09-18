package quantstamp.solidity.lang.ast.expression;

public final class Comparison extends BinaryExpression {

  public static enum ComparisonOp {
    LT, LTE, GT, GTE, EQ, NEQ;

    @Override
    public String toString() {
      switch (this) {
        case EQ:
          return "==";
        case GT:
          return ">";
        case GTE:
          return ">=";
        case LT:
          return "<";
        case LTE:
          return "<=";
        case NEQ:
          return "!=";
        default:
          throw new UnsupportedOperationException();
      }
    }
  }

  public final ComparisonOp op;

  public Comparison(final ComparisonOp op, final Expression left, final Expression right) {
    super(left, right);
    this.op = op;
  }

  @Override
  public String toString() {
    return left + " " + op + " " + right;
  }
}
