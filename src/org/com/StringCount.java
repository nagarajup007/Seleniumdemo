package org.com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		int count=1;
		for (int i = 0; i < s.length()-1; i++) {
			if ((s.charAt(i)==' ')&& (s.charAt(i+1)!=' ')) {
				count++;
			}
			
		}
		System.out.println(count);
		
		/*
		 * String[] words = line.split("\\W+");
		 * 
		 * int length = words.length; System.out.println(length);
		 */

		// Counts each character except space
		/*
		 * String string = "java language"; int count = 0;
		 * System.out.println(string.length()); for (int i = 0; i < string.length();
		 * i++) { if (string.charAt(i) != ' ') count++; } // Displays the total number
		 * of characters present in the given string
		 * System.out.println("Total number of characters in a string: " + count);
		 */
	}
}
