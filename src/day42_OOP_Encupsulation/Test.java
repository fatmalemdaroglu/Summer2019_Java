package day42_OOP_Encupsulation;

public class Test {
	
	public static void main(String[] args) {
		
		TestData obj = new TestData();
		// System.out.println(obj.name);  //the data is private
		System.out.println(obj.getName());
		String str = obj.getName();
		
		//System.out.println(obj.ID);     //the data is private
		System.out.println(obj.getID());
			int a = obj.getID();
			
			
		//modify
			//obj.name = "Nurzat"; 
			obj.setName("Nurzat");
			
			//System.out.println(obj.name);
			System.out.println(obj.getName());
			
			obj.setID(400);
			//System.out.println(obj.ID);
			System.out.println(obj.getID());
			
			
	}

}
