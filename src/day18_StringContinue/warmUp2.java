package day18_StringContinue;

import java.util.Scanner;

public class warmUp2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String firstName = input.nextLine();
		firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
		System.out.println(firstName);
		
		System.out.println("Enter your last name: ");
		String lastName = input.nextLine();
		lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
		System.out.println(lastName);
		
		System.out.println(firstName+" "+lastName);
		
		//charAt
		String firstName2 =(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
		String lastName2 =(""+lastName.charAt(0)).toUpperCase()+lastName.substring(1).toLowerCase();
		System.out.println(firstName2);
		System.out.println(lastName2);
		
	}

}
