package day15_stringMethods;

import java.util.Scanner;

public class task01 {
	public static void main(String[] args) {
		
    /*
    1. Write a program that calculates the sum of two numbers 
    entered by the user.
     */
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number");
                int n1 = input.nextInt();
                
    System.out.println("Enter the second number");
                int n2 = input.nextInt();
                
    System.out.println("The sum is: " + (n1+n2) );
    	
    input.close();
}
}
