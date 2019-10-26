package day43_JavaRecap;

public class Static_Vs_Ins_Vs_Cons {

	static {
		System.out.println("Static Block");
		//executed as son as the class is loaded,only once
	}
	
	public Static_Vs_Ins_Vs_Cons() {
		System.out.println("Constructor");
		//executed when the object is created, runs after the instance block
	}
	
	{
		System.out.println("Instance block");
		//executed when the object is created, runs before the constructor
	}
	

	public static void main(String[] args) {
		Static_Vs_Ins_Vs_Cons obj = new Static_Vs_Ins_Vs_Cons();
		Static_Vs_Ins_Vs_Cons obj2 = new Static_Vs_Ins_Vs_Cons();
		System.out.println("Hello");
	}
	
	
}
