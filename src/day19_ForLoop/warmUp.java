package day19_ForLoop;

import java.util.Scanner;

public class warmUp {
	public static void main(String[] args) {
		/*
		     Given:  username: cybertek.batch12@gmail.com
            password: Javengers
        write a program for the login functionality of the gmail account. (user input is required)
        - username can be entered either in upper or lower case
        - password MUST be entered as it is
        - if the username does not end with "@gmail.com":
                    print "it's not a valid email"
       - if username ends with gmail but :
                    username and password did not match:
                        print "Invalid username and password"
                    username did not match:
                        print "Invalid username"
                    password did not match:
                        print "Invalid password"
        - if the username and passwords are correct:
                    print "loged in successfully"
                    
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Username: ");
		String username = input.nextLine().toLowerCase();
		System.out.println("Password");
		String password =input.nextLine();
		
		String user = "cybertek.batch12@gmail.com";
		String pass = "Javengers";
		
		if (username.endsWith("@gmail.com")) {
			if(username.equalsIgnoreCase(user) && password.equals(pass)) {
				System.out.println("Loged in successfully"); 
			}else {
				if(!username.equalsIgnoreCase(user) && !password.equals(pass)) {
					System.out.println("Invalid username and password");
				}else if (!username.equalsIgnoreCase(user)) {
					System.out.println("Invalid username");
				}else {
					System.out.println("Invalid password");
				}
			}
		}	
		else {
			System.out.println("It's not a valid email");
		}
		
	input.close();
}
}
