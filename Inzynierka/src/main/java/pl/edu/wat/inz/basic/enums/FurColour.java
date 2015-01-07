package pl.edu.wat.inz.basic.enums;

public enum FurColour {
	BLACK(1, "czarny"), WHITE(2, "bia³y"), GINGER(3, "rudy"), OTHER(4,
			"wielokolorowy");

	private int intValue;
	private String name;

	private FurColour(int intValue, String name) {
		this.intValue = intValue;
		this.name = name;
	}

	public static FurColour fromIntValue(int intVal) {
		FurColour[] types = FurColour.values();
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
