package day06_ArithmeticOperators;

public class ArithmaticOperators {
	/*
	 +,-,/,* aritmatic operator
	 %:remainder,returns the remainder division
	 
	 */
	public static void main(String[] args) {
		int a=100;
		int b=a-400;
		System.out.println(b);
		
		int c=a+b;//100-300
		System.out.println(c);
		
		int X=3,Y=5,Z=X*Y;
		System.out.println(Z);
		
		double length = 100, width=10, Area=length*width;
		System.out.println(Area);
		
		System.out.println(3+5+4-2);
		
		//double resultNum=9/0;//denominator can not be ezero
		
		double Number1=10/3;
		double Number2=10f/3f;
		double Number3=10.0/3;
		System.out.println(Number1+"\\"+Number2+"\\"+Number3);
		
		int output= 12+6/3;
		System.out.println(output);
		
		/*
		 10/3==>3 with remainder of 1
		 12/5 ==>2 with remainder (12-(5*2))=2
		 */
		
		double remainder = 10%3;
		System.out.println(remainder);
		
		System.out.println(12%5);
		
		int number20=20%2;// 0 even
		int number45=45%2;// 1 odd
		int number65=65%2;//1 odd
		int number68=68%2;//0 even
		System.out.println(number20+" "+number45+" "+number65+" "+number68);
		
		/*
		 First come first serve in VIP /,*,%
		 highest (),
		 */
		
		
		
		
		
	}

}
