package day43_JavaRecap;

public class Practice {
    public static void main(String[] args) {
        
        StaticKeyword.printName();  // Nurzat
        // static methods can be called through the class name  
        
        
        // staticKeyword.printName2(); 
            //instance method cannot called through the class name
        
        Practice.printName(); //Semra
        
        printName(); // semra
        
        
        System.out.println(  StaticKeyword.StaName  );
        // static features can be called through class name
        
    //  System.out.println( staticKeyword.InsName );
            // instance vairables belong to the object, cannot be called through class name
        
        
        StaticKeyword obj = new StaticKeyword();
            obj.printName2();  
        // in order to call none static in statics, we MUST create object
        
    }
    
    public static void printName() {
        System.out.println("Semra");
    }
}
