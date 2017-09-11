package quantstamp.solidity.lang.ast.statement;

import quantstamp.solidity.lang.ast.Node;

// PlaceholderStatement = '_'

public final class PlaceholderStatement extends Node {
  @Override
  public String toString() {
    return "_";
  }
}
