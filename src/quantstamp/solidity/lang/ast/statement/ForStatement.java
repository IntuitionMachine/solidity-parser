package quantstamp.solidity.lang.ast.statement;

import quantstamp.solidity.lang.ast.expression.Expression;
import quantstamp.solidity.lang.ast.expression.ExpressionStatement;

// ForStatement = 'for' '(' (SimpleStatement)? ';' (Expression)? ';' (ExpressionStatement)? ')'
// Statement

public final class ForStatement extends Statement {
  public final SimpleStatement simpleStmt;
  public final Expression expr;
  public final ExpressionStatement exprStmt;
  final Statement stmt;

  public ForStatement(final SimpleStatement simpleStmt, final Expression expr,
      final ExpressionStatement exprStmt, final Statement stmt) {
    this.simpleStmt = simpleStmt;
    this.expr = expr;
    this.exprStmt = exprStmt;
    this.stmt = stmt;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("for (");
    if (simpleStmt != null) {
      sb.append(simpleStmt);
    }
    sb.append("; ");
    if (expr != null) {
      sb.append(expr);
    }
    sb.append("; ");
    if (exprStmt != null) {
      sb.append(exprStmt);
    }
    sb.append(")");
    sb.append(stmt);
    return sb.toString();
  }
}
