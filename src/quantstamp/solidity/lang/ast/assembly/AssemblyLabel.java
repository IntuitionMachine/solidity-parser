package quantstamp.solidity.lang.ast.assembly;

import quantstamp.solidity.lang.ast.Identifier;
import quantstamp.solidity.lang.ast.Node;

// AssemblyLabel = Identifier ':'

public final class AssemblyLabel extends Node {
  public final Identifier id;

  public AssemblyLabel(final Identifier id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return id + ":";
  }
}
