package day37_ClassAndObject;

public class CarObject {
	public static void main(String[] args) {
        Car     car1      =  new       Car();
//  classname    objName     keyword   constructor
                car1.Brand = "BMW";
                car1.Color = "White";
                car1.Mileage = 100000;
                car1.Model = "X6";
                car1.Price = 15000.5;
                car1.Year = 2000;
        
        System.out.println( car1.Brand );  //BMW
        System.out.println( car1.Color ); // white
        System.out.println( car1.Mileage); // 100000
        System.out.println( car1.Model );
        System.out.println( car1.Price );
        System.out.println( car1.Year );
        
        
        System.out.println("=====================================");
        Car car2  =  new   Car();
        
    //  System.out.println( car2.Brand ); // null
        
        car2.Brand = "Toyota";
        car2.Model = "Corolla";
        car2.Color = "Black";
        car2.Mileage = 150000;
        car2.Year = 2002;
        car2.Price = 2000 ;
        
        System.out.println( car2.Brand );  // toyota
        System.out.println( car2.Model );  // corolla
        System.out.println( car2.Year );  //  2002
        System.out.println( car2.Mileage ); // 150000
        System.out.println( car2.Color );  // black
        System.out.println( car2.Price );  //2000
        
        
        
        car1.drive();   // Driving BMW
        car2.drive();  // Driving Toyota
        
        car1.start();  // BMW is starting
        car2.start(); // toyota corolla is starting
        
        car2.getInfo();
        
	}
}
