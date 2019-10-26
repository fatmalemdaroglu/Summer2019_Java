package day38_CustomClassContinue;

public class Employee {

		String name;
		String ID;
		int age;
		int SSN;
		String JobTitle;
		double salary;
		
		public Employee(String name, String ID, int age, int SSN, String JobTitle, double salary) {
			this.name=name;
			this.ID =ID;
			this.age = age;
			this.SSN = SSN;
			this.JobTitle =JobTitle;
			this.salary = salary;
			
		}
		
		public void getInfo() {
			System.out.println("Employee's name is: " + name);
			System.out.println("Age is: "+age);
			System.out.println("Job title is: "+JobTitle);
			System.out.println("Employee ID is: "+ID);
			System.out.println("Salary: $"+ salary);
			System.out.println("--------------------------------------");
		}
}
