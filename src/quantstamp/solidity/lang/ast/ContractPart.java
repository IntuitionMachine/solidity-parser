package quantstamp.solidity.lang.ast;

// ContractPart = StateVariableDeclaration | UsingForDeclaration
// | StructDefinition | ModifierDefinition | FunctionDefinition
// | EventDefinition | EnumDefinition


public final class ContractPart extends Node {
  public final StructDefinition structDef;
  public final StateVariableDeclaration stateVarDecl;
  public final ModifierDefinition modifierDef;
  public final UsingForDeclaration usingForDecl;

  public ContractPart(final StateVariableDeclaration stateVarDecl) {
    this.usingForDecl = null;
    this.stateVarDecl = stateVarDecl;
    this.structDef = null;
    this.modifierDef = null;
  }

  public ContractPart(final UsingForDeclaration usingForDecl) {
    this.usingForDecl = usingForDecl;
    this.stateVarDecl = null;
    this.structDef = null;
    this.modifierDef = null;
  }

  public ContractPart(final StructDefinition structDef) {
    this.usingForDecl = null;
    this.structDef = structDef;
    this.stateVarDecl = null;
    this.modifierDef = null;
  }

  public ContractPart(final ModifierDefinition modifierDef) {
    this.usingForDecl = null;
    this.stateVarDecl = null;
    this.structDef = null;
    this.modifierDef = modifierDef;
  }
}
