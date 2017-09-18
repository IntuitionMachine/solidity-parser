package quantstamp.solidity.lang.ast.expression;

import quantstamp.solidity.lang.ast.FunctionCallArguments;

// FunctionCall = Expression '(' FunctionCallArguments ')'

public final class FunctionCall extends Expression {
  public final FunctionCallArguments functionCallArgs;
  public final Expression expr;

  public FunctionCall(final FunctionCallArguments functionCallArgs, final Expression expr) {
    this.functionCallArgs = functionCallArgs;
    this.expr = expr;
  }

  @Override
  public String toString() {
    return expr + "(" + functionCallArgs + ")";
  }
}
