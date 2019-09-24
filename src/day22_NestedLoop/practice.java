package day22_NestedLoop;

public class practice {
	public static void main(String[] args) {
	
		for (int i=6 ; i>=1; i--) {
			for (int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
		
        for(int z = 1; z <= 6 ; z++) {
            
            for(int k = 6; k >= z;  k--  ) {
                System.out.print("*");
            }
            System.out.println();
            
        } 
        
        System.out.println("\n\n\n");
        
        int i = 1;
        while(i<=5) {
     	   
            for(int j =1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
     	 i++;  
        }
        
        int a = 6;
        while(a>=1) {
        	int b = 1;
        	while (b<=a) {
        		System.out.print("*");
        		b++;
        	}
        	System.out.println();
        	a--;
        }

}
}
