package day12_switchStatement;

public class warmUP {
	public static void main(String[] args) {
		 /*
	     Warm up:
	     declare 3 numbers
	   if n1 and n2 are equal  => n1&n2 are equal
	   
	    if n2 and n3 are equal ==> n2&n3 are equal
	    if n3 and n1 are qual ==>n3&n1 are equal
	    if all equal ==> all equal
	    if none of them are euqal ==> none of them are equal
	        Do Not use single if statement
	    
	     */
	            // first way someone's solition
	            int n1= 4, n2 = 1, n3 = 5;
	            
	            if(n1 == n2 && n1!=n3) {  // true
	                System.out.println("n1 and n2 equal");
	            }
	            else if (n2 == n3 && n2 != n1) {
	                System.out.println("n2 and n3 equal");
	            } 
	            else if (n3 == n1 && n1 != n2 ) {  
	                System.out.println("n3 and n1 equal");
	            }
	            else if (n1 == n2 && n2 == n3 && n1 == n3 ) {
	                System.out.println("all equal");
	            }
	            else {
	                System.out.println("non equal");
	            }
	                 System.out.println("\n\n");
		
		//second way my way
		
		boolean pos1 = (n1 == n2);
		boolean pos2 = (n1 == n3);
		boolean pos3 = (n2 == n3);
		boolean pos4 = (n1==n2 && n1==n3);
			
		if (pos4) {
			System.out.println("They are all equal");
		}
			else if (pos1) {
		    System.out.println("n1 and n2 is equal");
		   }	
		    else if (pos2) {
		    System.out.println("n1 and n3 are equal");
		   }
		    else if (pos3) {
		    System.out.println("n2 and n3 are equal");
		   }
		 else {
				System.out.println("They are not equal");
		}
		
		
		// third way
		int A = 10, B=20, C=30;
		
		if (A == B && B == C) {//if all of them are equal
			System.out.println("They are all equal");
		}else // if not all of them are equal
		    if (A == B) {
		    System.out.println("A and B is equal");
		    }
		    else if (A == C) {
		    	System.out.println("n1 and n3 are equal");
		    }
		    else if (B == C) {
		    	System.out.println("B and C are equal");
		    }else { // if none of them are equal
		    	System.out.println("None of them equal");
		    }
	
		
		
		
		
		
		
		
		
		
		
		
		
	
}
}
