package day24_review;

public class WarmUp {
	public static void main(String[] args) {
		/*
		    1. write a program that can return the maximum value from an int array
    		2. write a program that can return the second maximum value from an int array
		    3. write a program that return the minimum value from an int array
     		4. write a program that return the second minimum value from an int array
		 */
		
		int[] numbers = {3 , 5 , 7 , 9 , 11 , 13 , 17};
		
		int max = 0;
		for (int i=0 ; i < numbers.length ; i++) {
			if (numbers[i]>max) {
				max = numbers[i];				
			}
		}		
		System.out.println("maximum number is: "+max);
		
		int secmax =0;
		for (int i=0 ; i < numbers.length ; i++) {
			if (numbers[i]>secmax  && numbers[i] < max) {
				secmax = numbers[i];				
			}
		}		
		System.out.println(secmax);
		
		int min = 999999999;
		for (int i=0 ; i < numbers.length ; i++) {
			if (numbers[i]<min) {
				min = numbers[i];				
			}
		}		
		System.out.println("minimum number is: "+min);		
		
		int secmin = 999999999;
		for(int i =0; i<numbers.length; i++) {
			if(numbers[i]<secmin && numbers[i] > min) {
				secmin=numbers[i];
			}
		}
		System.out.println(secmin);
	}

}
