package day43_JavaRecap;

import java.util.Arrays;

public class InstanceBlock {
	
	String[] names = new String[3];
	
	public InstanceBlock() {
		System.out.println("Constructor");
		names[0] = "ayse";
		names[2] = "fatma";
		names[1] = "hayriye";
	}
	
	{
		System.out.println("instance block");
		names[0] = "Selma";
		names[2] = "Aliye";
		names[1] = "Inci";
		
		//names[3]="Fatma";  out of boundary
	}
	
	
	
	public static void main(String[] args) {
		InstanceBlock obj = new InstanceBlock();//if object is not created instance block does not execute
		System.out.println("Main Method");
		System.out.println(Arrays.toString(obj.names));
		
		InstanceBlock obj2 = new InstanceBlock();
		
		
		
	}

}
