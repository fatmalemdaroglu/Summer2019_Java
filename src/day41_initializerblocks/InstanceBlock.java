package day41_initializerblocks;

public class InstanceBlock {
	{
		System.out.println("instance block");
	}
	
	public InstanceBlock() {
		System.out.println("Constractor");
	}
	public static void main(String[] args) {
		InstanceBlock obj = new InstanceBlock();
		InstanceBlock obj2 = new InstanceBlock();
		InstanceBlock obj3 = new InstanceBlock();
	}
}
