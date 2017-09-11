package quantstamp.solidity.lang.ast.statement;

import quantstamp.solidity.lang.ast.StringLiteral;
import quantstamp.solidity.lang.ast.assembly.InlineAssemblyBlock;

// InlineAssemblyStatement = 'assembly' StringLiteral? InlineAssemblyBlock

public final class InlineAssemblyStatement extends Statement {
  public final StringLiteral stringLiteral;
  public final InlineAssemblyBlock inlineAssemblyBlock;

  public InlineAssemblyStatement(final StringLiteral stringLiteral,
      InlineAssemblyBlock inlineAssemblyBlock) {
    this.stringLiteral = stringLiteral;
    this.inlineAssemblyBlock = inlineAssemblyBlock;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("assembly ");
    if (stringLiteral != null) {
      sb.append(stringLiteral);
      sb.append(" ");
    }
    sb.append(inlineAssemblyBlock);
    return sb.toString();
  }
}
