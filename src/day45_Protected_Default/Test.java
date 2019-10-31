package day45_Protected_Default;

import day45_Inheritance.ProtectedVsDefault;
/*
public class Test {
ilk once instance vermisti sonra static ekledi
 
	public static void main(String[] args) {
		
		ProtectedVsDefault obj = new ProtectedVsDefault();
			obj.printHello();//Protected is not visible outside package
			obj.printHola();//Default is not visible outside package
		
			System.out.println(obj.name);// protected
			System.out.println(obj.id);//default		
	}
}
*/
public class Test extends ProtectedVsDefault{
/*            sub              super
 	protected static String name;
			  String id;
			  
	protected static void printHello() {
		System.out.println("Hello");
	}
	
 */
	public static void main(String[] args) {

	       System.out.println( name );
	        printHello();
	        
	    //  System.out.println( id );  // only public and protected can be inherited outside the package
		
		
		
	
		
	}
}





















