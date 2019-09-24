package day03_Variables;

public class EscapeSequences {
   /*
	   \n (or \r) : starts from a new line
	   \t  : Horizontal tab
	   \\  : Back slash
	   \'  :Single quote
	   \"  :Double quote
	   \   :Back slash
	   /   :Front slash
   */
	public static void main(String[] args) {
		System.out.println("Hello Cybertek \nBatch 12 students");
		System.out.print("Tomorrow is off \n");
		System.out.print("True\n");
		System.out.println("False\n\n\n");
		
		System.out.println("\tClass starts tomorrow");
		
		System.out.println("\\Fatma");
		System.out.println("\' Java");
		
		System.out.println("Book is called\"Game of Throne\"");
	}

}
