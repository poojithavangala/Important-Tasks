
public class Variables {
	int myGlobalInt = 100;
	public static void main(String[] args){
		
	/*
	 * Byte
	 * Min: -128
	 * Max: 127
	 * Default: 0
	 */
		byte myByte=100;
		System.out.println("Byte value:" + myByte );
	/*
	 * Short
	 * Min: -32,768
	 * Max: 32,767
	 * Default: 0
	 */
		short myShort = 10000;
		System.out.println("Short:" + myShort);

	/*
	 * int
	 * Min: -2,147,483,648
	 * Max: 2,147,483,647
	 * Default: 0
	 */
		int myInt = 147283643;
		System.out.println("Integer value:" + myInt);
	/*
	 * long
	 * Min: -2^63
	 * Max: 2^63 -1
	 * Default: 0
	 */
		long myLong = 1472800000;
		System.out.println("Long-int value:" + myLong);

	/*
	 * float
	 * Default: 0.0f
	 */
		float myFloat=20.0f;
		System.out.println("Floating number:" + myFloat);
	/*
	  * double
	  * Default: 0.0d
	  */
		double myDouble = 21.0;
		System.out.println("Double Value: " + myDouble);
	 /*
	  * boolean
	  * false and true
	  * Default: false
	  */
		boolean myBoolean = true;
		System.out.println("Boolean Value: " + myBoolean);
	/*
	  * char
	  * Min: 0
	  * Max: 65,535
	  */
		char myChar = 'a';
		System.out.println("Char Value: " + myChar);
	}

	public void test(){
		myGlobalInt = 1000;
	}
	
}
