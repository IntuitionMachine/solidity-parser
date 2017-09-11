package quantstamp.solidity.lang.ast;

// EventDefinition = 'event' Identifier IndexedParameterList 'anonymous'? ';'

public final class EventDefinition extends Node {
  public final Identifier id;
  public final IndexedParameterList paramList;
  public final boolean anonymous;

  public EventDefinition(final Identifier id, final IndexedParameterList paramList,
      final boolean anonymous) {
    this.id = id;
    this.paramList = paramList;
    this.anonymous = anonymous;
  }

  @Override
  public String toString() {
    return "event " + id + " " + paramList + (anonymous ? "anonymous" : "");
  }
}
