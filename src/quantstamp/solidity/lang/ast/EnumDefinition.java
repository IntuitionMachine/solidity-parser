package quantstamp.solidity.lang.ast;

import java.util.List;

// EnumDefinition = 'enum' Identifier '{' EnumValue? (',' EnumValue)* '}'

public final class EnumDefinition extends Node {
  public final Identifier id;
  public final List<EnumValue> enumValues;

  public EnumDefinition(final Identifier id, final List<EnumValue> enumValues) {
    this.id = id;
    this.enumValues = enumValues;
  }
}
