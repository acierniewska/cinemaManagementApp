package pl.edu.wat.inz.basic.enums;

public enum EventType {
	// TODO dodaæ typy eventów
	;

	private int intValue;
	private String name;

	private EventType(int intValue, String name) {
		this.intValue = intValue;
		this.name = name;
	}

	public static EventType fromIntValue(int intVal) {
		EventType[] types = EventType.values();
		for (int i = 0; i < types.length; i++) {
			if (types[i].intValue == intVal) {
				return types[i];
			}
		}

		return null;
	}

	@Override
	public String toString() {
		return name;
	}

	public int getIntValue() {
		return intValue;
	}

}
