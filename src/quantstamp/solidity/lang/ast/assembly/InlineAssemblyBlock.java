package quantstamp.solidity.lang.ast.assembly;

import java.util.List;

import quantstamp.solidity.lang.ast.Node;

// InlineAssemblyBlock = '{' AssemblyItem* '}'

public final class InlineAssemblyBlock extends Node {
  public final List<AssemblyItem> assemblyItems;

  public InlineAssemblyBlock(final List<AssemblyItem> assemblyItems) {
    this.assemblyItems = assemblyItems;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("{ ");
    for (final AssemblyItem a : assemblyItems) {
      sb.append(a);
    }
    sb.append(" }");
    return sb.toString();
  }
}
