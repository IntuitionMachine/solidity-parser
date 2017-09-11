package quantstamp.solidity.lang.ast.assembly;

import quantstamp.solidity.lang.ast.Identifier;
import quantstamp.solidity.lang.ast.Node;

// AssemblyLocalBinding = 'let' Identifier ':=' FunctionalAssemblyExpression

public final class AssemblyLocalBinding extends Node {
  public final Identifier id;
  public final FunctionalAssemblyExpression expr;

  public AssemblyLocalBinding(final Identifier id, final FunctionalAssemblyExpression expr) {
    this.id = id;
    this.expr = expr;
  }

  @Override
  public String toString() {
    return "let " + id + " := " + expr;
  }
}
