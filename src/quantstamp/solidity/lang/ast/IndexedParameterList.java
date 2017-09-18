package quantstamp.solidity.lang.ast;

import java.util.List;

// IndexedParameterList = '(' ( TypeName 'indexed'? Identifier? (',' TypeName 'indexed'?
// Identifier?)* )? ')'

public final class IndexedParameterList extends Node {

  public class IndexedParameterListEntry {
    public final TypeName typeName;
    public final boolean indexed;
    public final Identifier id;

    public IndexedParameterListEntry(final TypeName typeName, final boolean indexed,
        final Identifier id) {
      this.typeName = typeName;
      this.indexed = indexed;
      this.id = id;
    }

    public IndexedParameterListEntry(final TypeName typeName, final boolean indexed) {
      this.typeName = typeName;
      this.indexed = indexed;
      this.id = null;
    }

    public IndexedParameterListEntry(final TypeName typeName) {
      this.typeName = typeName;
      this.indexed = false;
      this.id = null;
    }
  }

  public final List<IndexedParameterListEntry> entries;

  public IndexedParameterList(final List<IndexedParameterListEntry> entries) {
    this.entries = entries;
  }

}
