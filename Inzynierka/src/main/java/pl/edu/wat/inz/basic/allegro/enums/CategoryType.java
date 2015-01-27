package pl.edu.wat.inz.basic.allegro.enums;

public enum CategoryType {

	OTHER(90037, "Pozosta³e"), SCRATCH(90038, "Drapaki"), TOYS(90043, "Zabawki");

	private int intValue;
	private String name;

	private CategoryType(int intValue, String name) {
		this.intValue = intValue;
		this.name = name;
	}

	public static CategoryType fromIntValue(int intVal) {
		CategoryType[] types = CategoryType.values();
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
