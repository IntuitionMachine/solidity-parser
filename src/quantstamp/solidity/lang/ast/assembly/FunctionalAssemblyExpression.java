package quantstamp.solidity.lang.ast.assembly;

import java.util.List;

import quantstamp.solidity.lang.ast.Identifier;

// FunctionalAssemblyExpression = Identifier '(' AssemblyItem? ( ',' AssemblyItem )* ')'

public class FunctionalAssemblyExpression {
  public final Identifier id;
  public final List<AssemblyItem> assemblyItems;

  public FunctionalAssemblyExpression(final Identifier id, List<AssemblyItem> assemblyItems) {
    this.id = id;
    this.assemblyItems = assemblyItems;
  }
}
