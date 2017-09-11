package quantstamp.solidity.lang.ast;

// ImportDirective = 'import' StringLiteral ('as' Identifier)? ';'
// | 'import' ('*' | Identifier) ('as' Identifier)? 'from' StringLiteral ';'
// | 'import' '{' Identifier ('as' Identifier)? ( ',' Identifier ('as' Identifier)? )* '}' 'from'
// StringLiteral ';'

public class ImportDirective extends Node {
  public final StringLiteral stringLit;
  public final Identifier id1;
  public final Identifier id2;
  public final Identifier id3;
  public final Identifier id4;

  public ImportDirective(final StringLiteral stringLit, final Identifier id) {
    this.stringLit = stringLit;
    this.id1 = id;
    this.id2 = null;
    this.id3 = null;
    this.id4 = null;
  }

  public ImportDirective(final StringLiteral stringLit, final Identifier id1,
      final Identifier id2) {
    this.stringLit = stringLit;
    this.id1 = id1;
    this.id2 = id2;
    this.id3 = null;
    this.id4 = null;
  }

  public ImportDirective(final StringLiteral stringLit, final Identifier id1, final Identifier id2,
      final Identifier id3, final Identifier id4) {
    this.stringLit = stringLit;
    this.id1 = id1;
    this.id2 = id2;
    this.id3 = id3;
    this.id4 = id4;
  }
}
