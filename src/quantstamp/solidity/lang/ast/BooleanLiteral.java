package quantstamp.solidity.lang.ast;

// BooleanLiteral = 'true' | 'false'

public final class BooleanLiteral extends Node {
  public final boolean val;

  public BooleanLiteral(boolean val) {
    this.val = val;
  }

  public BooleanLiteral True() {
    return new BooleanLiteral(true);
  }

  public BooleanLiteral False() {
    return new BooleanLiteral(false);
  }

  @Override
  public String toString() {
    if (val) {
      return "true";
    } else {
      return "false";
    }
  }
}
