package quantstamp.solidity.lang.ast;

// Int = 'int' | 'int8' | 'int16' | 'int24' | 'int32' | 'int40' | 'int48' | 'int56' | 'int64' |
// 'int72' | 'int80' | 'int88' | 'int96' | 'int104' | 'int112' | 'int120' | 'int128' | 'int136' |
// 'int144' | 'int152' | 'int160' | 'int168' | 'int176' | 'int184' | 'int192' | 'int200' | 'int208'
// | 'int216' | 'int224' | 'int232' | 'int240' | 'int248' | 'int256'

public final class Byte extends Node {

  public static enum ByteType {
    BYTE, BYTES, BYTES1, BYTES2, BYTES3, BYTES4, BYTES5, BYTES6, BYTES7, BYTES8, BYTES9, BYTES10, BYTES11, BYTES12, BYTES13, BYTES14, BYTES15, BYTES16, BYTES17, BYTES18, BYTES19, BYTES20, BYTES21, BYTES22, BYTES23, BYTES24, BYTES25, BYTES26, BYTES27, BYTES28, BYTES29, BYTES30, BYTES31, BYTES32
  }

  public final ByteType byteType;

  public Byte(final ByteType byteType) {
    this.byteType = byteType;
  }

  @Override
  public String toString() {
    return byteType.toString();
  }
}
