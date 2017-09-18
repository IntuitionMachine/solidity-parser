package quantstamp.solidity.lang.ast.assembly;

import quantstamp.solidity.lang.ast.Identifier;
import quantstamp.solidity.lang.ast.Node;
import quantstamp.solidity.lang.ast.expression.HexLiteral;
import quantstamp.solidity.lang.ast.expression.NumberLiteral;
import quantstamp.solidity.lang.ast.expression.StringLiteral;

// AssemblyItem = Identifier | FunctionalAssemblyExpression | InlineAssemblyBlock |
// AssemblyLocalBinding | AssemblyAssignment | AssemblyLabel | NumberLiteral | StringLiteral |
// HexLiteral

public final class AssemblyItem extends Node {
  public final Identifier id;
  public final FunctionalAssemblyExpression funcAssemblyExpr;
  public final InlineAssemblyBlock inlineAssemblyBlock;
  public final AssemblyLocalBinding assemblyLocalBinding;
  public final AssemblyAssignment assemblyAssignment;
  public final AssemblyLabel assemblyLabel;
  public final NumberLiteral numberLiteral;
  public final StringLiteral stringLiteral;
  public final HexLiteral hexLiteral;

  public AssemblyItem(final Identifier id) {
    this.id = id;
    this.funcAssemblyExpr = null;
    this.inlineAssemblyBlock = null;
    this.assemblyLocalBinding = null;
    this.assemblyAssignment = null;
    this.assemblyLabel = null;
    this.numberLiteral = null;
    this.stringLiteral = null;
    this.hexLiteral = null;
  }

  public AssemblyItem(final FunctionalAssemblyExpression funcAssemblyExpr) {
    this.id = null;
    this.funcAssemblyExpr = funcAssemblyExpr;
    this.inlineAssemblyBlock = null;
    this.assemblyLocalBinding = null;
    this.assemblyAssignment = null;
    this.assemblyLabel = null;
    this.numberLiteral = null;
    this.stringLiteral = null;
    this.hexLiteral = null;
  }

  public AssemblyItem(final InlineAssemblyBlock inlineAssemblyBlock) {
    this.id = null;
    this.funcAssemblyExpr = null;
    this.inlineAssemblyBlock = inlineAssemblyBlock;
    this.assemblyLocalBinding = null;
    this.assemblyAssignment = null;
    this.assemblyLabel = null;
    this.numberLiteral = null;
    this.stringLiteral = null;
    this.hexLiteral = null;
  }

  public AssemblyItem(final AssemblyLocalBinding assemblyLocalBinding) {
    this.id = null;
    this.funcAssemblyExpr = null;
    this.inlineAssemblyBlock = null;
    this.assemblyLocalBinding = assemblyLocalBinding;
    this.assemblyAssignment = null;
    this.assemblyLabel = null;
    this.numberLiteral = null;
    this.stringLiteral = null;
    this.hexLiteral = null;
  }

  public AssemblyItem(final AssemblyAssignment assemblyAssignment) {
    this.id = null;
    this.funcAssemblyExpr = null;
    this.inlineAssemblyBlock = null;
    this.assemblyLocalBinding = null;
    this.assemblyAssignment = assemblyAssignment;
    this.assemblyLabel = null;
    this.numberLiteral = null;
    this.stringLiteral = null;
    this.hexLiteral = null;
  }

  public AssemblyItem(final AssemblyLabel assemblyLabel) {
    this.id = null;
    this.funcAssemblyExpr = null;
    this.inlineAssemblyBlock = null;
    this.assemblyLocalBinding = null;
    this.assemblyAssignment = null;
    this.assemblyLabel = assemblyLabel;
    this.numberLiteral = null;
    this.stringLiteral = null;
    this.hexLiteral = null;
  }

  public AssemblyItem(final NumberLiteral numberLiteral) {
    this.id = null;
    this.funcAssemblyExpr = null;
    this.inlineAssemblyBlock = null;
    this.assemblyLocalBinding = null;
    this.assemblyAssignment = null;
    this.assemblyLabel = null;
    this.numberLiteral = numberLiteral;
    this.stringLiteral = null;
    this.hexLiteral = null;
  }

  public AssemblyItem(final StringLiteral stringLiteral) {
    this.id = null;
    this.funcAssemblyExpr = null;
    this.inlineAssemblyBlock = null;
    this.assemblyLocalBinding = null;
    this.assemblyAssignment = null;
    this.assemblyLabel = null;
    this.numberLiteral = null;
    this.stringLiteral = stringLiteral;
    this.hexLiteral = null;
  }

  public AssemblyItem(final HexLiteral hexLiteral) {
    this.id = null;
    this.funcAssemblyExpr = null;
    this.inlineAssemblyBlock = null;
    this.assemblyLocalBinding = null;
    this.assemblyAssignment = null;
    this.assemblyLabel = null;
    this.numberLiteral = null;
    this.stringLiteral = null;
    this.hexLiteral = hexLiteral;
  }

  @Override
  public String toString() {
    if (id != null)
      return id.toString();
    if (funcAssemblyExpr != null)
      return funcAssemblyExpr.toString();
    if (inlineAssemblyBlock != null)
      return inlineAssemblyBlock.toString();
    if (assemblyLocalBinding != null)
      return assemblyLocalBinding.toString();
    if (assemblyAssignment != null)
      return assemblyAssignment.toString();
    if (assemblyLabel != null)
      return assemblyLabel.toString();
    if (numberLiteral != null)
      return numberLiteral.toString();
    if (stringLiteral != null)
      return stringLiteral.toString();
    if (hexLiteral != null)
      return hexLiteral.toString();
    throw new UnsupportedOperationException();
  }
}
