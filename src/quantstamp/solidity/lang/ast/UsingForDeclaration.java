package quantstamp.solidity.lang.ast;

// UsingForDeclaration = 'using' Identifier 'for' ('*' | TypeName) ';'

public final class UsingForDeclaration extends Node {
  public final Identifier identifier;
  public final TypeName typeName;

  public UsingForDeclaration(final Identifier identifier) {
    this.identifier = identifier;
    this.typeName = null;
  }

  public UsingForDeclaration(final Identifier identifier, final TypeName typeName) {
    this.identifier = identifier;
    this.typeName = typeName;
  }
}
