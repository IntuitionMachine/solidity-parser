package quantstamp.solidity.lang.ast.expression;

import quantstamp.solidity.lang.ast.TypeName;

// NewExpression = 'new' TypeName

public final class NewExpression extends Expression {
  public final TypeName typeName;

  public NewExpression(final TypeName typeName) {
    this.typeName = typeName;
  }

  @Override
  public String toString() {
    return "new " + typeName;
  }
}
