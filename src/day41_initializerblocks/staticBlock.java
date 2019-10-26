package day41_initializerblocks;

public class staticBlock {
	
	static {
		System.out.println("Static block2");
	}
	
	public staticBlock() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		
		staticBlock obj1 = new staticBlock();
		staticBlock obj2 = new staticBlock();
		System.out.println("Main method");
	}
	
	static {//sonra gelse bile once yazdiriliyor main methoddan
		System.out.println("Static block1");
	}

}
