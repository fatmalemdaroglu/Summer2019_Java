package day43_JavaRecap;

public class LogIn {
	public static void main(String[] args) {
		
		Credentials obj = new Credentials();
		//obj.Username ="Fatma"; // instance variable is private
		//obj.Password = "Parishco";//instance variable is private
		
		//System.out.println(obj.Username);
		//System.out.println(obj.Password);
		
		//read:
		System.out.println(obj.getUsername());
		System.out.println(obj.getPassword());
		
		//modify:
			obj.setUsername("Fatma");
			obj.setPassword("Parishco");
			
			System.out.println(obj.getUsername());
			System.out.println(obj.getPassword());
			 
				
	}

}
