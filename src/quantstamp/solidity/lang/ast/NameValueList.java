package quantstamp.solidity.lang.ast;

import java.util.List;

import quantstamp.solidity.lang.ast.expression.Expression;

// NameValueList = Identifier ':' Expression ( ',' Identifier ':' Expression )*

public final class NameValueList extends Node {

  public class NameValueEntry {
    public final Identifier id;
    public final Expression expr;

    public NameValueEntry(final Identifier id, final Expression expr) {
      this.id = id;
      this.expr = expr;
    }
  }

  public final List<NameValueEntry> nameValueList;

  public NameValueList(List<NameValueEntry> nameValueList) {
    this.nameValueList = nameValueList;
  }
}
