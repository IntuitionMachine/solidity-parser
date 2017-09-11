package quantstamp.solidity.lang.ast;

// NumberUnit = 'wei' | 'szabo' | 'finney' | 'ether'
// | 'seconds' | 'minutes' | 'hours' | 'days' | 'weeks' | 'years'

public final class NumberUnit extends Node {
  public static enum NumberUnitValue {
    WEI, SZABO, FINNEY, ETHER, SECONDS, MINUTES, HOURS, DAYS, WEEKS, YEARS
  }

  public final NumberUnitValue numberUnitVal;

  public NumberUnit(final NumberUnitValue numberUnitVal) {
    this.numberUnitVal = numberUnitVal;
  }

  @Override
  public String toString() {
    return numberUnitVal.toString();
  }
}
