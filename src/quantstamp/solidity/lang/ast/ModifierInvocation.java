package quantstamp.solidity.lang.ast;

// ModifierInvocation = Identifier ( '(' ExpressionList? ')' )?

public final class ModifierInvocation extends Node {
  public final Identifier id;
  public final ExpressionList exprList;

  public ModifierInvocation(final Identifier id, final ExpressionList exprList) {
    this.id = id;
    this.exprList = exprList;
  }

  @Override
  public String toString() {
    if (exprList != null) {
      return id + "(" + exprList + ")";
    } else {
      return id + "()";
    }
  }
}
