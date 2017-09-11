package quantstamp.solidity.lang.ast;

import java.util.List;

// IdentifierList = '(' ( Identifier? ',' )* Identifier? ')'

public final class IdentifierList extends Node {
  public final List<Identifier> idList;

  public IdentifierList(final List<Identifier> idList) {
    this.idList = idList;
  }

  @Override
  public String toString() {
    return "IdentifierList [idList=" + idList + "]";
  }


}
