package day19_ForLoop;

public class Tasks {
	public static void main(String[] args) {
	
	//task01
	for (int i = 1; i<=10; i++ ) {
		System.out.println("The square of " + i + " is "+ (i*i));
	}
	
	//task02
	
	for(int x =1; x <=32; x++) {
		if(x%2 == 0) {
		System.out.println(x+" ");
		}
	}
	
	//task03
	
	for(int x =1; x <=32; x++) {
		if(x%2 != 0) {
		System.out.print(x+" ");
		}
	}
	
	//task04
    System.out.println();
    
    String str = "Cybertek";
    //            01234567
    //  "avaJ"
    String Rev =""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
    
    String Reversed ="";
    for(int i = str.length()-1 ; i >= 0; i--) {
        Reversed += str.charAt(i);
    }
    System.out.println(Rev);
    System.out.println(Reversed);
    

	}	
}
