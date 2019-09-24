package day16_Review;

import java.util.Scanner;

public class nextLine {
	public static void main(String[] args) {
		/*
		 write a program that accepts zip-code,city,state,phone number and displayed all those gathered information
		 do not use next() method
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your zip code");
		int zipcode = input.nextInt();
		
		input.nextLine();
		System.out.println("Please enter city name");
		String cityname = input.nextLine();
	
		System.out.println("Enter your phone number");
		int pn = input.nextInt();
		
		input.nextLine();
		System.out.println("Please enter state name");
		String sn = input.nextLine();
		

		
		System.out.println("zip code is:"+zipcode);
		System.out.println("City name is:"+cityname);
		System.out.println("Phone number is:"+pn);
		System.out.println("State name is:" + sn);
		
	}

}
