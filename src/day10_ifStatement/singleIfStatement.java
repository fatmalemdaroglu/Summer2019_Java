package day10_ifStatement;

public class singleIfStatement {
	public static void main(String[] args) {
		 /*
        single if:
               if ( boolean expression)  { 
                       // A
               }
        */
       
       if( 9 > 8 ) {
           // true
           System.out.println("9 is greater than 8");         
       }   
       
       if( 9 < 8) {
       //  false   
           System.out.println("8 is greater than 9");
           
       }
           
       System.out.println("Test Completed"); // does not belong to any if block
       
       
       // Task01:
       int num1=500;
       int num2=100;      
       int max = 0 ; // local variables needs to be initialized before use
       
       if( num1 > num2 ) {  // means that num1 is greater than num2
           // false
           // max = num1;
           max += num1;
       }
       
       if( num2 > num1 ) {  
           // true  
           // max = num2;
            max += num2;
       }
       
       if( num1 == num2 ) {
    	   //  max = num2;
           max += num2;
           System.out.println("both numbers are equal");
       }
       
       
       System.out.println("Maximum number between "+num1 +" and "+num2+" is "+ max);
       
   
   // task02:
       int hours = 14;  //   2 pm
       int minutes = 45;
       int seconds = 30;
       
       String amOrPm ="pm";
       
       System.out.println( hours + ":" +minutes + ":"+seconds+" "+amOrPm );   
       // hours:minutes:seconds am
   
   
   // task03:

   int n1=12000, n2= 3000, n3 = 190000000;     
   int maximum = 0;  // local variable must be initialized before use
   
   if ( n1 > n2 && n1 > n3 ) {
       maximum = n1;
   }
   
   if(n2 > n1 && n2 > n3) {
       maximum = n2;
   }
   
   if(n3 > n1 && n3 > n2 ) {
       maximum = n3;
   }
   String result = "Maximum number between" + n1 + ", " + n2 + ", " + n3+ " is " + maximum;
   System.out.println(result); 
   
   
   // solution 2:
   if(n1 > n2 && n1 > n3) {
       System.out.println("Maximum number is " +n1);
   }
   
   if (n2>n1 && n2 > n3) {
       System.out.println("Maximum number is "+n2);
   }
   
   if(n3 > n1 && n3 > n2) {
       System.out.println("Maximum number is "+n3);
   }

   		int A;
   		if(true) {
   			A=12;
   		}
   		System.out.println(A);	
   
   // task04
   		int statusCode = 404;
   		String finalResult = "Invalid Status Code";
   		
   		if (statusCode == 200) {
   			finalResult = "Ok";
   		}
   		if (statusCode == 201) {
   			finalResult = "Created";
   		}
   		if (statusCode ==404) {
   			finalResult = "Not Found";
   		}
   		System.out.println("Status Code " + statusCode+" is: " + finalResult	);
   		
   		
   	//task05
   		int number =100;
   		String str = "zero";
   		if(number > 0) {
   			str="positive";
   		}
   		if (number < 0) {
   			str="negative";
   		}
   		System.out.println(number + " is " + str);
   
   
   
   
   
   
   
}
}