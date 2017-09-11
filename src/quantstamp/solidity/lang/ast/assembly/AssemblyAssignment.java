package quantstamp.solidity.lang.ast.assembly;

import quantstamp.solidity.lang.ast.Identifier;
import quantstamp.solidity.lang.ast.Node;

// AssemblyAssignment = ( Identifier ':=' FunctionalAssemblyExpression ) | ( '=:' Identifier )

public final class AssemblyAssignment extends Node {
  public final Identifier id;
  public final FunctionalAssemblyExpression expr;

  public AssemblyAssignment(final Identifier id, final FunctionalAssemblyExpression expr) {
    this.id = id;
    this.expr = expr;
  }

  public AssemblyAssignment(final Identifier id) {
    this.id = id;
    this.expr = null;
  }

  @Override
  public String toString() {
    if (expr != null) {
      return id + " := " + expr;
    } else {
      return "=: " + id;
    }
  }
}
