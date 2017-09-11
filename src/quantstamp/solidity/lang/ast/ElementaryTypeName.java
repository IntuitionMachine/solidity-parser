package quantstamp.solidity.lang.ast;

// ElementaryTypeName = 'address' | 'bool' | 'string' | 'var'
// | Int | Uint | Byte | Fixed | Ufixed

public final class ElementaryTypeName extends Node {

  public static enum ElementaryTypeNameValue {
    ADDRESS, BOOL, STRING, VAR, INT, UINT, BYTE, FIXED, UFIXED
  }

  public final ElementaryTypeNameValue val;

  public ElementaryTypeName(final ElementaryTypeNameValue val) {
    this.val = val;
  }

}
