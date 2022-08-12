package day2.assignments;

import java.util.Arrays;
public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
		Arrays.sort(arr);
		for(int j=0;j<arr.length;j++) {
		
			if(j!=arr[j]) {
				System.out.println(arr[j]);
			}
		}
		
	}
}
