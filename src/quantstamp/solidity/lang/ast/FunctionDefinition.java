package quantstamp.solidity.lang.ast;

import java.util.List;

// FunctionDefinition = 'function' Identifier? ParameterList
// ( ModifierInvocation | StateMutability | 'external' | 'public' | 'internal' | 'private' )*
// ( 'returns' ParameterList )? ( ';' | Block )

public final class FunctionDefinition extends Node {

  public static enum FunctionVisibility {
    PUBLIC, PRIVATE, EXTERNAL, INTERNAL
  }

  public final Identifier id;
  public final ParameterList paramList;
  public final ParameterList returnParamList;
  public final Block block;
  public final List<ModifierInvocation> modifierInvocationList;
  public final List<StateMutability> stateMutabilityList;
  public final List<FunctionVisibility> funcVisibilityList;

  public FunctionDefinition(final Identifier id, final ParameterList paramList,
      ParameterList returnParamList, Block block,
      final List<ModifierInvocation> modifierInvocationList,
      List<StateMutability> stateMutabilityList,
      final List<FunctionVisibility> funcVisibilityList) {
    this.id = id;
    this.paramList = paramList;
    this.returnParamList = returnParamList;
    this.block = block;
    this.modifierInvocationList = modifierInvocationList;
    this.stateMutabilityList = stateMutabilityList;
    this.funcVisibilityList = funcVisibilityList;
  }

}
