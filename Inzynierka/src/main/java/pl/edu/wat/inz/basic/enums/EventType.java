package pl.edu.wat.inz.basic.enums;

public enum EventType {
	SPR(1, "Sprawozdawczoœæ", "emp1"), FINANSE(2, "Finanse", "emp1"), MEETING_Z(
			3, "Zebrania zarz¹du", "emp2"), MEETING_R(4, "Zebrania rady",
			"emp2"), MEETING(5, "Spotkania", "emp2"), VET(6,
			"Wizyta u weterynarza", "emp3"), OTHER(7, "Inne", "emp4");

	private int intValue;
	private String name;
	private String styleClass;

	private EventType(int intValue, String name, String styleClass) {
		this.intValue = intValue;
		this.name = name;
		this.styleClass = styleClass;
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

	public String getStyleClass() {
		return styleClass;
	}

}
