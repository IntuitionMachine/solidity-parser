package quantstamp.solidity.lang.ast;

// EnumValue = Identifier

public final class EnumValue extends Node {
  public final Identifier id;

  public EnumValue(final Identifier id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return id.toString();
  }
}
