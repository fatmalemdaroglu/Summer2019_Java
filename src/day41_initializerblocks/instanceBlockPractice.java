package day41_initializerblocks;

public class instanceBlockPractice {
    
	public String name="Shirin";  //"Mihray" , "Dinara
  
    public instanceBlockPractice(){
        this(10);  // name = "Muhtar";
        name = "Dinara";
    //  this(10);  // constructor call has to be the first step
    }
   
    {
        name ="Mihray";
    }
    
    public instanceBlockPractice(int a) {
            name = "Muhtar";
    }
    
    {
        name = "Hatice";
    }
    
    public static void main(String[] args) {
        
        instanceBlockPractice obj = new instanceBlockPractice();
            obj.name = "Aijamal";
        System.out.println(obj.name );  //Dinara
        
        instanceBlockPractice obj2 = new instanceBlockPractice();
        System.out.println( obj2.name );  // Dinara
      
        //System.out.println(name);
    }
}
