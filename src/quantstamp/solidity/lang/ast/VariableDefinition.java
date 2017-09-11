package quantstamp.solidity.lang.ast;

import quantstamp.solidity.lang.ast.expression.Expression;

// VariableDefinition = ('var' IdentifierList | VariableDeclaration) ( '=' Expression )?

public final class VariableDefinition extends Node {
  public final IdentifierList idList;
  public final VariableDeclaration varDecl;
  public final Expression expr;

  public VariableDefinition(final IdentifierList idList, final Expression expr) {
    this.idList = idList;
    this.varDecl = null;
    this.expr = expr;
  }

  public VariableDefinition(VariableDeclaration varDecl, final Expression expr) {
    this.idList = null;
    this.varDecl = varDecl;
    this.expr = expr;
  }
}
