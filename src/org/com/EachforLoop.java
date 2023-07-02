package org.com;

import java.util.Arrays;
import java.util.Iterator;

public class EachforLoop {

	public static void main(String[] args) {
		int[] arry = { 9, 7, 6, 5, 7, 8 };
		// Initialize min with first element of array.
		int min = arry[0];
		// Loop through the array
		for (int i = 0; i < arry.length; i++) { // 9
			// Compare elements of array with min
			if (arry[i] < min) { // 9<9
				min = arry[i];
			}
		}
		System.out.println("Smallest element present in given array: " + min);

		
		
		
		
		
		
		//finding the first and last number in array
		int first = arry[0];
		int last = arry[arry.length - 1];
		System.out.println("First: " + first + "\n" + "Last: " + last);
		System.out.println(arry.length - 1);
		//count
		int su = Arrays.stream(arry).sum();
		System.out.println(su);
        //count
		System.out.println("coutnt sum of the arry lenth");
		int sum = 0;
		for (int i = 0; i < arry.length; i++) {
			sum = sum + arry[i];

		}
		System.out.println(sum);

		
		
		/*
		 * for (int i = 0; i < arry.length; i++) { System.out.println(i);
		 * 
		 * }
		 */

		/*
		 * // Creating Arrays and Populating them char[] char_arr = { 'a', 'b', 'c',
		 * 'd', 'e' }; int[] int_arr = { 1, 2, 3, 4, 5, 6, 7 }; String[] str_arr = {
		 * "GFG", "GEEKS", "GEEKSFORGEEKS" };
		 * 
		 * 
		 * 
		 * // print char array System.out.print("Char Array: [ "); for (char c :
		 * char_arr) { System.out.print("'" + c + "' "); // } System.out.println("]");
		 */
	}

}
