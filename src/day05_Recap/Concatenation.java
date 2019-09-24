package day05_Recap;

public class Concatenation {
	/*
	 String:represents the sequences of characters, used for string text
	 string values are surrendered by a double quote
	 
	 Concatenation:combining, linking things together ==> creates a String Value
	 			achieved by using +operator
	 			we can concat any value
	 */
     public static void main(String[] args) {
    	 String str = "any text goes here";
    	 System.out.println(str);
    	 
    	 String str2 = "1";
    	 System.out.println(str2);
    	 
    	 System.out.println("Hello World");
    	 
    	 String Hello = "Hello world";
    	 System.out.println(Hello);
    	 
    	 
    	 String myName = "Cybertek"+" School";
    	 System.out.println(myName);
	
    	 String Year = "This is"+"2019";
    	 System.out.println(Year);
   // Example 	 
    	 String name = "Fatma";
    	 System.out.println("My name is "+name);
    	/*
    	 cucumber is 3 $
    	 tomato is 5 $	 
    	 */
    	 int cucumber = 3;   int tomato = 5;
    	 
    	 System.out.println("Cucumber is "+ '$' + cucumber);
    	 System.out.println("Tomato is "+"$"+tomato);
    	 
    	 String newStr = "100"+10;
    	 System.out.println(newStr);
    	 
    	 System.err.println(1+2+3);
    	 System.out.println("1"+2+3);//"12"+3==>123
    //   System.out.println("1"+1-3);//"11"-3 it gives error because we can not subtract 3 from text
    	 System.out.println("Batch 12"); 
    	 System.out.println(2-1+1+"4");
    	 System.out.println("Batch12"+ (1+2));
    	 System.out.println(1+"123"+4+5);
    	 System.out.println(1+ ("1"+2));
    	 System.out.println(1+ ('1'+2));
    	 System.out.println("3"+'3');//33 if we concat char to string , char is concated as character
    	 System.out.println(12+'3');//63 if we concat char to number,representive number of char will be concated
    	 System.out.println('7'+3);//55+3
    	 float temperature = 98.6f;
    		
}
}