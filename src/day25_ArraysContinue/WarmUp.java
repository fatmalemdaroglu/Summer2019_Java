package day25_ArraysContinue;

public class WarmUp {
	/*
	 1.write a program that can print out the unique values from an int Array
	 Ex:
	 	if arr -> {1,1,2,3,3}
	 	output:2
	 	
	 	if arr -> {1,2,2,3,4,4}
	 	output: 1 3
	 */
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,3,4,4,8,7,9};
		for(int j = 0; j < arr.length; j++) {	
			int count = 0;// to find out how many time a value is appeared in the array
			for(int i=0; i < arr.length; i++) {			
				if(arr[i] == arr[j])	// compares each index of the array with the given value
					count++;			// Everytime if the value is occured in the array, count will be increased by one	
			}
			if(count == 1) {
				System.out.println(arr[j]);
			}
		}
		/*
		 *2.write a program that can print out the unique values from String Array
		 */
		
		String[] arr2 = {new String("a"), "a","a","b","b","c"};
		
		for(int i = 0; i < arr2.length; i++) {
			int count2 = 0;
			for(int j = 0; j<arr2.length; j++) {
				if(arr2[j].equals(arr2[i])) {
					count2++;
				}
			}
			
			if(count2 == 1) {
				System.out.println(arr2[i]);
			}
		}                                                                                                                                                     
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
