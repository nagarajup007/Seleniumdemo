package org.com;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry = { 9, 7, 6, 5, 7, 8 };
		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arry.length; i++) {
			for (int j = i + 1; j < arry.length; j++) {// J compares to i so i=9 and j=7
				if (arry[i] == arry[j])
					System.out.println(arry[j]);
			}

		}
		//Write a Java program to find duplicate values in an array of string values.
		String[] my_array = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu" };

		for (int i = 0; i < my_array.length ; i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if ((my_array[i].equals(my_array[j])) && (i != j)) {
					System.out.println("Duplicate Element is : " + my_array[j]);
				}
			}

		}
	}
}
