public class Elements{
	private int type;
	private int intValue;
	private double doubleValue;
	private String stringValue;
	public static final int INTS = 0;
	public static final int DOUBLES = 1;
	public static final int STRINGS = 2;

	public Element(int valType, int intVal, double doubleVal, String stringVal){
		type = valType;
		this.intValue = intValue;
		this.doubleValue = doubleValue;
		this.stringValue = stringValue;
	}

	public int getType(){
		return type
	}

	public int getInt(){
		return intValue;
	}

	public double getDouble(){
		return doubleValue;
	}

	public String getString(){
		return stringValue;
	}

	public String toString(){
		result = "";
		if (type == INTS) result += intValue;
		if (type == DOUBLES) result += doubleValue;
		if (type == STRINGS) result += stringValue;
		return result;
	}
}