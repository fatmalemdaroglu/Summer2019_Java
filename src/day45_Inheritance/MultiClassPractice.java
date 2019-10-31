package day45_Inheritance;

class Data{
	public String name;
	private String age;
	String Id;
	protected String DOB;
	
	public void Hello() {
		//Hola();
		System.out.println("Hello");
	}
	
	private void Hola() {
		System.out.println("Hola");
	}
	
	void Aloha() {
		//Hola();
		System.out.println("Aloha");
	}
	
}
public class MultiClassPractice {
	public static void main(String[] args) {
		Data obj = new Data();
		System.out.println(obj.name);//public is visible everywhere
		//System.out.println(obj.age);//private not visible outside class
		System.out.println(obj.Id);//default is visible within same package
		
		//if those two classes were located in two different packages,then default won't be visible
		
		obj.Hello();
		//obj.Hola();//private
		obj.Aloha();
		
		
	}
}
