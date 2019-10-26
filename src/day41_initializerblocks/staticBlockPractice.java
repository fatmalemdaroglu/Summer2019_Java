package day41_initializerblocks;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlockPractice {
	
	public static String name;
	public static int[] arr1;
	public static ArrayList<String> list = new ArrayList<>();
	public static ArrayList<String> students = new ArrayList<>();
	public static String[] online = {"Arzigul","Me","Spike","Savas","Bahadir"};
	public static String[] inclass = {"Daryna","Nadira","Olga","Mizgin"};
	public static double a=100;
	public int grade;

	static {
		name="Selma";
		arr1 = new int[5]; //{0,0,0,0,0}
		arr1[0]=1;			//{1,0,0,0,0}
		arr1[2]=3;			//{1,0,3,0,0}
		
		list.add("Coffee");
		list.add("Tea");
		
		students.addAll(Arrays.asList(online));
		
		a=300;
	}	
	
	public staticBlockPractice() {
		name="Aliye";
		grade=100;
	}
	
	static {
		name="fatma";
		arr1 = new int[3];//{0,0,0}
		arr1[1]=2;
		
		list.add("Break");
		
		students.addAll(Arrays.asList(inclass));
		
		a=400;
		//list.add(6,"Madina");//we can not skip index
	}
	
	
	public static void main(String[] args) {
		staticBlockPractice obj = new staticBlockPractice();
		System.out.println(name);  //null
		System.out.println(Arrays.toString(arr1));
		System.out.println(list);
		System.out.println(students);
		a=500;
		System.out.println(a);
		System.out.println(obj.grade);
		
	}
	

	

}
