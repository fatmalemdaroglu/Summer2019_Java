package day45_Inheritance;

public class ProtectedVsDefault {
	protected static String name;
			  String id;
			  
	protected static void printHello() {
		System.out.println("Hello");
	}
	
	static void printHola() {
		System.out.println("Hola");
	}
}


class cybertek{
	public static void main(String[] args) {
		
		ProtectedVsDefault obj = new ProtectedVsDefault();
				
				obj.printHello();
				obj.printHola();
				
			System.out.println(obj.name);
			System.out.println(obj.id);
				
				
}
}






