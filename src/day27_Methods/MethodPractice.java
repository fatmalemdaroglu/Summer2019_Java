package day27_Methods;

public class MethodPractice {
	/*

	 write a method that can remove duplicates from the string and prints out the result
	           
	           Ex: RemoveDuplicates("aabbcccccddddaaa")
	           output: abc
	           
	*/
	public static void main(String[] args) {	
		RemoveDuplicates("DDDEEEFFF");
	}
	static public void RemoveDuplicates(String str) {
		String remove="";
		for(int i=0; i<str.length();i++) {
			if(!remove.contains(str.substring(i,i+1)))
				remove+=str.charAt(i);
		}
		System.out.println(remove);
	}	
}
