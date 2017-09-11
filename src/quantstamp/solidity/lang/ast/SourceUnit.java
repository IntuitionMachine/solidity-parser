package quantstamp.solidity.lang.ast;

// SourceUnit = (PragmaDirective | ImportDirective | ContractDefinition)*

public final class SourceUnit extends Node {
  public final ContractDefinition contractDef;
  public final ImportDirective importDir;
  public final PragmaDirective pragmaDir;

  public SourceUnit(final ContractDefinition contractDef) {
    this.contractDef = contractDef;
    this.importDir = null;
    this.pragmaDir = null;
  }

  public SourceUnit(final ImportDirective importDir) {
    this.contractDef = null;
    this.importDir = importDir;
    this.pragmaDir = null;
  }

  public SourceUnit(final PragmaDirective pragmaDir) {
    this.contractDef = null;
    this.importDir = null;
    this.pragmaDir = pragmaDir;
  }

  @Override
  public String toString() {
    if (contractDef != null) {
      return contractDef.toString();
    } else {
      return "";
    }
  }
}
