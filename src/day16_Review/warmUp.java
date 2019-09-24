package day16_Review;

import java.util.Scanner;

public class warmUp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstName = input.nextLine();
		System.out.println("Enter your last name: ");
		String lastName = input.nextLine();
		System.out.println(lastName.toUpperCase() +" "+ firstName.toUpperCase());
		input.close();
		
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name and last name");
        String firstname = scan.nextLine(),
                lastname = scan.nextLine();
        
        String fullname = firstname+" "+lastname;
                fullname = fullname.toUpperCase();
        System.out.println("your full name is: "+fullname);
        scan.close();
       
		
}
}