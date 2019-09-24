package day22_NestedLoop;

public class WarmUp2 {
	   /*
    2. write a program that can check if the String is palindrome. 
    if it's print "true", otherwise print "false"   
                   DO NOT USE FOR LOOP
       Ex: input: level
           output: true,  (because reversed value is still "level")
    */
	public static void main(String[] args) {
		String str = "asdfghjklp";
		String rev = "";
		/*
		for (int i = str.length()-1; i>=0 ; i--) {
			rev += str.substring(i,i+1);
		}
		System.out.println(rev);
		boolean result = str.equals(rev);
		System.out.println(result);
		
		*/
		
        int i = str.length()-1;
        while ( i >= 0 ) {
          //rev += str.substring(i, i+1);
            rev += str.charAt(i);      
            i--;
        }
        
        System.out.println(rev);
        boolean result = str.equals(rev) ? true : false;
        System.out.println( result );

	}

}
