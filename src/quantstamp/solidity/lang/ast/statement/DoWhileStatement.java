package quantstamp.solidity.lang.ast.statement;

import quantstamp.solidity.lang.ast.expression.Expression;

// DoWhileStatement = 'do' Statement 'while' '(' Expression ')'

public final class DoWhileStatement extends Statement {
  public final Statement stmt;
  public final Expression expr;

  public DoWhileStatement(final Statement stmt, final Expression expr) {
    this.stmt = stmt;
    this.expr = expr;
  }

  @Override
  public String toString() {
    return "do " + stmt + " while (" + expr + ")";
  }
}
