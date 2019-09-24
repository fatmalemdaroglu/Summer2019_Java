package day06_ArithmeticOperators;

public class PrimitivesCasting {
	/*
	 casting:converting larger primitive to smaller size
	         datatype variablename = (datatype)value
	 casting : Expicit * implicit
	 */
	public static void main(String[] args) {
		//Explicit Casting:
		int a = 10;
		byte b = (byte) a;
		System.out.println(b);
		
		double DecimalNum = 10.5;
		float FloatNum = (int) DecimalNum;
		System.out.println(FloatNum);
		
		long LongNum = 300l;
		int IntNum = (int) LongNum;//we can cast to short but not byte
		System.out.println(IntNum);
		
		//implicit Casting:
		byte ByteNum = 100;
		int IntNum2 = ByteNum;
		//same
		int IntNum3 = (int) ByteNum;
		
		short ShortNum=100;
		long LongNum2=ShortNum;
		//same
		long LongNum3=(long)ShortNum;
		
		//Explicit Casting:
		double LargestNum=100.8765;
		byte byteValue=(byte)LargestNum;
		float FloatValue=(byte)LargestNum;
		System.out.println(ByteNum);
		System.out.println(FloatNum);
	      
        float FloatVal = (float) LargestNum;// 100.8765F
        float FloatValue2 = (int) LargestNum;
        float FloatValue3 = (byte) LargestNum;  // 100.0
        float FloatValue4 = (short) LargestNum;
        float FloatValue5 = (long) LargestNum; 
        System.out.println(FloatVal);  // 100.8765
		
		
		/* int Num1=100;
		 * int Num2=200;
		 * int Num3=300;
		 */
        int Num1=100,Num2=200,Num3=300;
        
        boolean result=true;// before initilazed that does not give result
        System.out.println(result);
        
        boolean result1,result2,result3=true;
        System.out.println();
        
    
	}

}
