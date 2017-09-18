package quantstamp.solidity.lang.ast;

// Int = 'int' | 'int8' | 'int16' | 'int24' | 'int32' | 'int40' | 'int48' | 'int56' | 'int64' |
// 'int72' | 'int80' | 'int88' | 'int96' | 'int104' | 'int112' | 'int120' | 'int128' | 'int136' |
// 'int144' | 'int152' | 'int160' | 'int168' | 'int176' | 'int184' | 'int192' | 'int200' | 'int208'
// | 'int216' | 'int224' | 'int232' | 'int240' | 'int248' | 'int256'

public final class Int extends Node {

  public static enum IntType {
    INT, INT8, INT16, INT24, INT32, INT40, INT48, INT56, INT64, INT72, INT80, INT88, INT96, INT104, INT112, INT120, INT128, INT136, INT144, INT152, INT160, INT168, INT176, INT184, INT192, INT200, INT208, INT216, INT224, INT232, INT240, INT248, INT256
  }

  public final IntType intType;

  public Int(final IntType intType) {
    this.intType = intType;
  }

  @Override
  public String toString() {
    return intType.toString();
  }
}
