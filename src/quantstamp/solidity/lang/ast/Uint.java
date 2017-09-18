package quantstamp.solidity.lang.ast;

// Uint = 'uint' | 'uint8' | 'uint16' | 'uint24' | 'uint32' | 'uint40' | 'uint48' | 'uint56' |
// 'uint64' |
// 'uint72' | 'uint80' | 'uint88' | 'uint96' | 'uint104' | 'uint112' | 'uint120' | 'uint128' |
// 'uint136' |
// 'uint144' | 'uint152' | 'uint160' | 'uint168' | 'uint176' | 'uint184' | 'uint192' | 'uint200' |
// 'uint208'
// | 'uint216' | 'uint224' | 'uint232' | 'uint240' | 'uint248' | 'uint256'

public final class Uint extends Node {

  public static enum UintType {
    UINT, UINT8, UINT16, UINT24, UINT32, UINT40, UINT48, UINT56, UINT64, UINT72, UINT80, UINT88, UINT96, UINT104, UINT112, UINT120, UINT128, UINT136, UINT144, UINT152, UINT160, UINT168, UINT176, UINT184, UINT192, UINT200, UINT208, UINT216, UINT224, UINT232, UINT240, UINT248, UINT256
  }

  public final UintType uintType;

  public Uint(final UintType uintType) {
    this.uintType = uintType;
  }

  @Override
  public String toString() {
    return uintType.toString();
  }
}
