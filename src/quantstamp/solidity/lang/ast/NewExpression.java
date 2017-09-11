package quantstamp.solidity.lang.ast;

// NewExpression = 'new' TypeName

public final class NewExpression extends Node {
  public final TypeName typeName;

  public NewExpression(final TypeName typeName) {
    this.typeName = typeName;
  }

  @Override
  public String toString() {
    return "new " + typeName;
  }
}
