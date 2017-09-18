package quantstamp.solidity.lang.ast;

// ContractPart = StateVariableDeclaration | UsingForDeclaration
// | StructDefinition | ModifierDefinition | FunctionDefinition
// | EventDefinition | EnumDefinition


public final class ContractPart extends Node {
  public final StateVariableDeclaration stateVarDecl;
  public final UsingForDeclaration usingForDecl;
  public final StructDefinition structDef;
  public final ModifierDefinition modifierDef;
  public final FunctionDefinition funcDef;
  public final EventDefinition eventDef;
  public final EnumDefinition enumDef;

  public ContractPart(final StateVariableDeclaration stateVarDecl) {
    this.stateVarDecl = stateVarDecl;
    this.usingForDecl = null;
    this.structDef = null;
    this.modifierDef = null;
    this.funcDef = null;
    this.eventDef = null;
    this.enumDef = null;
  }

  public ContractPart(final UsingForDeclaration usingForDecl) {
    this.stateVarDecl = null;
    this.usingForDecl = usingForDecl;
    this.structDef = null;
    this.modifierDef = null;
    this.funcDef = null;
    this.eventDef = null;
    this.enumDef = null;
  }

  public ContractPart(final StructDefinition structDef) {
    this.stateVarDecl = null;
    this.usingForDecl = null;
    this.structDef = structDef;
    this.modifierDef = null;
    this.funcDef = null;
    this.eventDef = null;
    this.enumDef = null;
  }

  public ContractPart(final ModifierDefinition modifierDef) {
    this.stateVarDecl = null;
    this.usingForDecl = null;
    this.structDef = null;
    this.modifierDef = modifierDef;
    this.funcDef = null;
    this.eventDef = null;
    this.enumDef = null;
  }

  @Override
  public String toString() {
    if (stateVarDecl != null)
      return stateVarDecl.toString();
    if (usingForDecl != null)
      return usingForDecl.toString();
    if (structDef != null)
      return structDef.toString();
    if (modifierDef != null)
      return modifierDef.toString();
    if (funcDef != null)
      return funcDef.toString();
    if (eventDef != null)
      return eventDef.toString();
    if (enumDef != null)
      return enumDef.toString();
    throw new RuntimeException("Node: ContractPart");
  }
}
