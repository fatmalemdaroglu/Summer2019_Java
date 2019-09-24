package day20_JavaRecap;

public class WarmUp {
	public static void main(String[] args) {
		
		int sum1 = 0;
		for (int i = 1; i <=1000; i++) {
			sum1 += i;
		}
		System.out.println("Sum of the numbers: "+ sum1 );
		
		int sum2 = 0;
		for (int i=1; i<=1000; i++) {
			if (i%2 == 1) { sum2 += i; }
		}
		System.out.println("Sum of the odd numbers: "+ sum2 );
		
		int sum3 = 0;
		for (int i=1; i<=1000; i+=2) {
		  sum3 += i; 
		}
		System.out.println("Sum of the odd numbers: "+ sum3 );
		
		int sum4 = 0;
		for (int i=2; i<=1000; i++) {
			if (i%2 == 0) {sum4 += i;}
		}
		System.out.println("Sum of the even numbers: "+ sum4 );
		
		int sum5 = 0;
		for (int i=2; i<=1000; i+=2) {
			sum5 += i;
		}
		System.out.println("Sum of the even numbers: "+ sum5 );
	}

}
