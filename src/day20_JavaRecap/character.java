package day20_JavaRecap;

public class character {
	public static void main(String[] args) {
		

		for (int i = 65; i<= 90; i++) {
			char letter = (char)i;
			System.out.print(letter+ " ");
		}
		System.out.println();
		
		for (int i = 97; i<= 122; i++) {
			char letter = (char)i;
		System.out.print(letter+ " ");
		}
		System.out.println();
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch+" ");
		}
		System.out.println();
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch+" ");
		}
		
}
}
