package day18_StringContinue;

import java.util.Scanner;

public class warmUp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first and last names: ");
		String firstName = input.next();
		input.nextLine();
		String lastName =input.nextLine();
		//String initials = firstName.substring(0,1)+""+lastName.substring(0,1);
		String initials = ""+firstName.charAt(0)+lastName.charAt(0);
		initials = initials.toUpperCase();
		System.out.println("Initials is: "+initials);
		
		
		String LastLetters = ""+firstName.charAt(firstName.length()-1)
							+"."+lastName.charAt(lastName.length()-1);
		LastLetters = LastLetters.toLowerCase();
		System.out.println("Last letters are: "+LastLetters);
	
		int FirstNameIndex = firstName.length()-1;
		int LastNameIndex = lastName.length()-1;
		
		String LastLetter2 = firstName.substring(FirstNameIndex)+lastName.substring(LastNameIndex);
		System.out.println("Last letters are: "+LastLetter2);
		
		input.close();
	
	
	}
}
