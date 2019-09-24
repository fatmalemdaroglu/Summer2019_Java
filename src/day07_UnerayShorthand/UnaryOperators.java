package day07_UnerayShorthand;

public class UnaryOperators {
	public static void main(String[] args) {
		/*
		 ++: increment
		 --: increment
		 */
		int a =10;
		int b =-10;
		System.out.println(b);
		int c = +b;  //+(-10)==>-10
		System.out.println(c);
		int d = -c;   //-(-10)==>10
		System.out.println(d);
		int f = -(10);
		System.out.println(f);
		
		/* Increment: increases the value by 1
		    increment are:
				1.pre increment:operator is placed before the variable
				2.post increment:operator is placed after the variable
								increase the value next stage
		*/
		int num1 = 100;
		++num1; // num1+1
		int num2 = ++num1;
		System.out.println(num2); // num2==>101+1
		
		
		int IntNum =100;
		System.out.println(IntNum++);//100
		System.out.println(IntNum);//101
		
		int IntNum2 = IntNum ++; // IntNum2=101
		System.out.println(IntNum2);
		System.out.println(IntNum);
		
		int x = 100;
		int y =x++;
		System.out.println(y);
				
		
		/*decrement: decreases the value by 1
		 			1.pre decrement
					2.post decrement
		*/
		int z=100;
		System.out.println(--z);
		
		int Y = 95;
		System.out.println(Y--);//95
		System.out.println(y);//94
		
		int T= 25;
		System.out.println(++T);//26
		System.out.println(--T);//25
		
		
		int P = 50;
		P = --P + P++ + P-- + P++; 
		//  49 + 49 + 50 + 49
		System.out.println(P);
		
		int F = 1;
		F = ++F + F-- / -F-- * F++; 
		System.out.println(F);
		//  2 + 2 / -1 * 0
		
		
		short Snum = 4;
		int R = Snum*4 - Snum--; // 4*4-4
		System.out.println(R);
		System.out.println(Snum);
		
		
		int W =1;
			W = -W-- + W++ / -W-- * --W;
			//  -1 +   0  /  -1   * -1
		System.out.println(W);
		
		
		b=2;
		c= b++;
		System.out.println(c);
			
		
	}

}
