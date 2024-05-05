package arrays;

import java.lang.reflect.Array;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
	
		
		String[] arr = {"cat","dog","insane","forty","six"};
		
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[3] = arr[4] ;
		//4. print the third element again
		System.out.println(arr[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//6. make an array of 50 integers
		int[] arr1 = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = rand.nextInt(51);
			
		}
		int min = arr1[0];
		for(int i = 0; i <arr1.length; i ++) {
			if(arr1[i] < min) {
				min = arr1[i];
				
			}
			
		}
		System.out.println(min);
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		
		//10. print the largest number in the array.
	    int max = arr1[0] ;
	    for(int i = 0; i<arr1.length; i++) {
	    	if(arr1[i] < max);
	    	max = arr1[i];
	    }
	   
	    
	}
}
