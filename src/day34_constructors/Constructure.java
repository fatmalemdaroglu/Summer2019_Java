package day34_constructors;

public class Constructure {
//  public sort() {   }    in constructor, the method name MUST be same with the name of the class
    
    // default constructor
    
    public Constructure(int a) {
        
        System.out.println("Hi I am constructor with parameter of int: "+ a);
     
    }
    
    public static void main(String[] args) {
        
    //  ConstructorsPractice obj = new ConstructorsPractice();  // does not exist
        
 // default (no-arg) constructor is given by default, when there is no other constructors
        
        
    //  ConstructorsPractice obj2 = new ConstructorsPractice("Hello");
            // we don't have constror that bpasses String parameter
        
        
        method1();
        
    //  ConstructorsPractice(10) ;
        
        
        Constructure obj3 = new Constructure(10);
                // constructor' execution is ALWAYS depends on the creation of object
        
        
         method2();
        
    }
    
    
    public static void method1() {
        
        System.out.println("Regular method");
        
    }
    
    public static void method2() {
        
        Constructure obj4 = new Constructure(10);
        method1();
    }
}
