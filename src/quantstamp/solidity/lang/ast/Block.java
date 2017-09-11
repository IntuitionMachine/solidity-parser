package quantstamp.solidity.lang.ast;

import java.util.List;

import quantstamp.solidity.lang.ast.statement.Statement;

// Block = '{' Statement* '}'

public final class Block {
  public final List<Statement> statements;

  public Block(final List<Statement> statements) {
    this.statements = statements;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("{ ");
    for (final Statement stmt : statements) {
      sb.append(stmt);
      sb.append(";\n");
    }
    sb.append(" }");
    return sb.toString();
  }
}
