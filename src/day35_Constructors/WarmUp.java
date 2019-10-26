package day35_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {
		/*		1. write a return method that accepts an int array and returns it as an ArrayList
			    2. write a return method that accepts an Integer array and returns the maximum number
			            DO NOT USE SORT METHOD
			    3. write a return method that accepts an Integer arrayList and returns the second maximum number
			            DO NOT USE SORT METHOD
			    4. write a return method that accepts an Integer array and returns the minimum number
			            DO NOT USE SORT METHOD
			    5. write a return method that accepts an Integer arrayList and returns the second minimum number
			            DO NOT USE SORT METHOD
		*/
	
	public static void main(String[] args) {
		//task01
		int[] arr = {1,2,3,4,5};
		ArrayList<Integer> list = ArrayToArrayList(arr);
		System.out.println(list);
		System.out.println(ArrayToArrayList(arr));
		
		double[] arr2 = {1.5, 2.5, 3.5, 4.5};
		ArrayList<Double> list2 = ArrayToArrayList(arr2);
		System.out.println(list2);
		
		//task02
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		int max = MaxNum(list3);
		System.out.println(max);
		
		//task03
		ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(10, 20, 35, 30, 35));
		int seconMax = SecondMax(list4);
		System.out.println(seconMax);
		
		//task04
		int[] Numbers = {1,2,3,4,5,6,7,8,-100};
		ArrayList<Integer> list5 = ArrayToArrayList(Numbers);
			int min = MinNum(list5);
		System.out.println(min);
		
	    // task05:
        int[] numbers2 = {100, 9, 8, 700, 18, 9, 0, 0, 0};
        ArrayList<Integer> list6 = ArrayToArrayList(numbers2);
        
            int secondminimum  = SecondMin(list6); //8
        System.out.println(secondminimum);		
	}
	
	
	//Task01;
	public static ArrayList<Integer>  ArrayToArrayList(int[] arr){
		ArrayList<Integer> list = new ArrayList<>();
			for(int each : arr) {
				list.add(each); //auto-boxing
			}
		return list;
	}
	public static ArrayList<Double>  ArrayToArrayList(double[] arr){
		ArrayList<Double> list = new ArrayList<>();
			for(double each : arr) {
				list.add(each); //auto-boxing
			}
		return list;		
	}

	//Task02;
	public static int MaxNum(ArrayList<Integer> list) {
		int max=Integer.MIN_VALUE;
		for(int each : list) { // unboxing
			if(each > max) {
				max=each;
			}
			
		}
		return max;
	}

	//Task03;
	public static int SecondMax(ArrayList<Integer> list) {
		Integer max = MaxNum(list);
		list.removeAll(Arrays.asList(max));
		int SecondMax = MaxNum(list);
		
		return SecondMax;
	}

	//Task04;
	public static int MinNum(ArrayList<Integer> list) {
		int min=Integer.MAX_VALUE;
		for(int each : list) { // unboxing
			if(each < min) {
				min=each;
			}
			
		}
		return min;		
	}

	//Task05;
	public static int SecondMin(ArrayList<Integer> list) {
		Integer firstMin = MinNum(list); //list.remove(firstMin); this cn not remove all max numbers
		list.removeAll(Arrays.asList(firstMin));
		 return MinNum(list);
	}






}
