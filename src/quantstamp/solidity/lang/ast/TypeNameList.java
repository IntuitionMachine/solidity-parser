package quantstamp.solidity.lang.ast;

import java.util.List;

// TypeNameList = '(' ( TypeName (',' TypeName )* )? ')'

public final class TypeNameList extends Node {
  public final List<TypeName> typeNames;

  public TypeNameList(final List<TypeName> typeNames) {
    this.typeNames = typeNames;
  }
}
