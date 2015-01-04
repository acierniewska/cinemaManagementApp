package pl.edu.wat.inz.basic.enums;

public enum ApplicationType {
	// TODO doda� reszt� wniosk�w
	ADOPTION(0, "Wniosek o adopcj�"), VIRTUAL_ADOPTION(1,
			"Wniosek o adopcj� wirtualn�");

	private int intValue;
	private String name;

	private ApplicationType(int intValue, String name) {
		this.intValue = intValue;
		this.name = name;
	}

	public static ApplicationType fromIntValue(int intVal) {
		ApplicationType[] types = ApplicationType.values();
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

	public int getIntVal() {
		return intValue;
	}

}
