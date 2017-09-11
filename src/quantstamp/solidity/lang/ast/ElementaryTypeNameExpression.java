package quantstamp.solidity.lang.ast;

// ElementaryTypeNameExpression = ElementaryTypeName

public final class ElementaryTypeNameExpression extends Node {
  public final ElementaryTypeName elemTypeName;

  public ElementaryTypeNameExpression(final ElementaryTypeName elemTypeName) {
    this.elemTypeName = elemTypeName;
  }

  @Override
  public String toString() {
    return elemTypeName.toString();
  }
}
