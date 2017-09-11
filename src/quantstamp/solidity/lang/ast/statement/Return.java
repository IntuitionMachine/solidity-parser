package quantstamp.solidity.lang.ast.statement;

import quantstamp.solidity.lang.ast.expression.Expression;

// Return = 'return' Expression?

public final class Return extends Statement {

  public final Expression expr;

  public Return() {
    this.expr = null;
  }

  public Return(final Expression expr) {
    this.expr = expr;
  }

  @Override
  public String toString() {
    return "return" + (expr != null ? expr : "");
  }

}
