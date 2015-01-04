package pl.edu.wat.inz.basic.enums;

public enum ReportPositionType {
	// TODO dodaæ typy pozycji raportu
	;

	private int intValue;
	private String name;

	private ReportPositionType(int intValue, String name) {
		this.intValue = intValue;
		this.name = name;
	}

	public static ReportPositionType fromIntValue(int intVal) {
		ReportPositionType[] types = ReportPositionType.values();
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
