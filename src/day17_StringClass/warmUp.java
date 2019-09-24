package day17_StringClass;

import java.util.Scanner;

public class warmUp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First and Last Name:");
		String firstName = input.nextLine();
		String lastName = input.nextLine();
		String fullName2=firstName.concat(" "+lastName);
		//in concat method you can only give String variable or String value
		String fullName=firstName+lastName;
		int totalNumber=fullName.length();
		System.out.println("Your full name has "+totalNumber+" characters");
		int lastIndexNum = fullName2.length()-1;
		System.out.println(fullName2+" cointains "+lastIndexNum+" characters");
		input.close();
	}

}
