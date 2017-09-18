package quantstamp.solidity.lang.ast.expression;

import quantstamp.solidity.lang.ast.ElementaryTypeName;

// ElementaryTypeNameExpression = ElementaryTypeName

public final class ElementaryTypeNameExpression extends PrimaryExpression {
  public final ElementaryTypeName elemTypeName;

  public ElementaryTypeNameExpression(final ElementaryTypeName elemTypeName) {
    this.elemTypeName = elemTypeName;
  }

  @Override
  public String toString() {
    return elemTypeName.toString();
  }
}
