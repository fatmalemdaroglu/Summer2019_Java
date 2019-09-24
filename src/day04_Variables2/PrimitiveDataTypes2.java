package day04_Variables2;

public class PrimitiveDataTypes2 {
	/*
	 boolean:takes either true or false expressions
	 char:declared with in the single quote ''; single character only
	 		'' is a MUST when you give character as value
	 */
	public static void main(String[] args) {
		
		//boolean result4 = earch is flat; This does not work
		// boolean num1 = 100; boolean only takes true or false results.
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9 > 3 ;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		
		// char
		
		char char1 = 'a';
		System.out.println(char1);
		
		char char2 = '9';
		char char3 = '#';
		System.out.println("\n\n");
		
		//char with numbers
		
		char char4 = 67; //only time we use '' for char is when we are declaring single character
		System.out.println(char4);
		
		char char6 = '{';
		System.out.println(char6);
		char char7 = 123;
		System.out.println(char7);
		
		//initializing char to other primitives:byte,short,int,
		char MyChar1 = 'b';
		int MyInt = MyChar1;// the number that represents b is initialized to the int
		System.out.println(MyInt); 
		
		//byte MyByte = Mychar1; // char's memory is 2 btes but byte's memory is 1 bytes
		byte MyByte2 = 'b';		
		System.out.println(MyByte2);
		
		//short ShortNum = Mychar1; //char's memory could be bigger than short. char's range is larger than short
		short ShortNum2 = 'b';
		System.out.println(ShortNum2);
		
		long LongNum = MyChar1; // long's mempry is 8 bytes
		long LongNum2 ='b';//98
		System.out.println(LongNum);
		
		float floatNum = MyChar1;
		float floatNum2 = 'b';
		System.out.println(floatNum2);
		
		double doubleNum = MyChar1;
		double doubleNum2 = 'b';
		System.out.println(doubleNum2);
		
		char myCharValue = 2222;
		System.out.println(myCharValue);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
