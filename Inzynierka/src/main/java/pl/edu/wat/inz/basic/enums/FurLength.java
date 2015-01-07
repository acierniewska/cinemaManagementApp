package pl.edu.wat.inz.basic.enums;

public enum FurLength {
	SHORT(1, "krótkie"), LONG(2, "d³ugie"), SEMI_LONG(3, "pó³d³ugie");

	private int intValue;
	private String name;

	private FurLength(int intValue, String name) {
		this.intValue = intValue;
		this.name = name;
	}

	public static FurLength fromIntValue(int intVal) {
		FurLength[] types = FurLength.values();
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
