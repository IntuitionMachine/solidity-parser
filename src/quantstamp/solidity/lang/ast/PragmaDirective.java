package quantstamp.solidity.lang.ast;

// PragmaDirective = 'pragma' Identifier ([^;]+) ';'

public final class PragmaDirective extends Node {
  public final Identifier id;

  public PragmaDirective(final Identifier id) {
    this.id = id;
  }
}
