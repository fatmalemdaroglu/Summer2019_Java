package day08_ShorthandedUnary;

public class LogicalOperators {
	public static void main(String[] args) {
		/*
		 && : And Logic ==> true && false ==> false
		 || : Or Logic  ==> true || false ==> true
		 */
		
	
		//&&
		boolean ResultA = 9==0 && "Muhtar" == "good";
                       // False && False  ===> False
		System.out.println(ResultA);
		
		
		boolean ResultB = 8>5 && 7==(8-2+1);
		               // true && true ==> true
		System.out.println(ResultB);
		
		
		Boolean ResultC = !false != true && !false == !(!true);
		                    // false && true ==> false
		System.out.println(ResultC);
		
		//||
		
		boolean ResultD = "Monday" == "Fun-day" || 6==6;
        				// False || True ===> True
        System.out.println(ResultD);


        boolean ResultE = true || false; //==> true
        System.out.println(ResultE);


        Boolean ResultF= !(8>5) || !("Today" != "friday");
             			// false || false ==> false
        System.out.println(ResultF);
		
        
        // ||  && :
        
		
		
		
		
	}

}
