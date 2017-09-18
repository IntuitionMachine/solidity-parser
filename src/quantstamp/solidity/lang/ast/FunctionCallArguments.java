package quantstamp.solidity.lang.ast;

// FunctionCallArguments = '{' NameValueList? '}'
// | ExpressionList?


public final class FunctionCallArguments extends Node {
  public final NameValueList nameValueList;
  public final ExpressionList exprList;

  public FunctionCallArguments(final ExpressionList exprList) {
    this.nameValueList = null;
    this.exprList = exprList;
  }

  public FunctionCallArguments(final NameValueList nameValueList, final ExpressionList exprList) {
    this.nameValueList = nameValueList;
    this.exprList = exprList;
  }

  @Override
  public String toString() {
    return "{ " + (nameValueList != null ? nameValueList.toString() : "") + " }" + exprList;
  }
}
