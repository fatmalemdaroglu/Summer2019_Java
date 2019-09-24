package day10_ifStatement;

public class Nested_if {
	public static void main(String[] args) {
		
	    /*
	     Nested if:
	     
	        if(  condition1  ){
	                if( condition2){
	                        // some code to run
	                }
	         }
	               
	     */
	           
	        if(true) {
	            System.out.println("Hello Cybertek");
	            
	            if(true) {
	                System.out.println("Hello WOrld");
	            }
	            
	        }
	        
	        
	        
	        if(true) {
	            System.out.println("Hello batch 12"); // printed
	            
	            if(false) {
	                System.out.println("Hello programmers");
	            } 
	            else {
	                System.out.println("Hello Team SDET"); // printed
	            }
	            
	        }
		
	        
	        /*Task
	          60<= garde < 70 ==> D
	          70 <= grade < 80 ==> C
	          80 <= grade < 90 ==> B
	          90 <= grade <= 100 ==>A
	          50 <= grade < 60 ==> F
	          40<= grade <50 ==> G
	          30 <= grade < 40 ==> H
	          20<=  grade < 30 ==> I
	          10 <= grade < 20 ==> J
	          0<=  grade <10  ==> K 
	         */
	        
	        int angle1 = 45;
        	int angle2 = 90;
        	int angle3 = 45;
        
          	int result = angle1+angle2+angle3;
        
            if (angle1 > 0 && angle1 < 180 && angle2 > 0 && angle2 < 180 && angle3 > 0 && angle3 < 180) {
                    
                    if ( result == 180) {
                            System.out.println("you have perfect angle");
                            }
                    }
            
            		else {
            				System.out.println("please check the angels");
            		}
            
            /*Task
	          60<= grade < 70 ==> D
	          70 <= grade < 80 ==> C
	          80 <= grade < 90 ==> B
	          90 <= grade <= 100 ==>A
	          0 <= grade < 60 ==> F
            */
    
            int grade = 19;
            
            if( grade >= 60 && grade <= 100) {
                System.out.println("you passed");
                
                if( grade >=90 && grade <= 100) {
                    System.out.println("\twith a grade of A");
                    
                } 
                else if(grade >=80 && grade < 90) {
                    System.out.println("\twith a grade of B");
                }
                else if(grade >= 70 && grade < 80) {
                    System.out.println("\twith a grade of C");
                }
                else {  // 60 <= grade < 70
                    System.out.println("\t with a grade of D");
                }
                
            }
            else {  // either less than 60 or greater than 100
                
                if(grade < 60 && grade >=0) {
                    System.out.println("You failed with a grade of F");
                }
                else { // greater than 100
                    System.out.println("Invalid score, error 404");
                }
                
            }
            
	}

}
