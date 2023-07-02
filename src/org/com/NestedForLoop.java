package org.com;

import java.util.Iterator;

public class NestedForLoop {
	public static void main(String[] args) {
		System.out.println("one");
		int k = 1;
		for (int i = 0; i < 4; i++) {

			// System.out.println("outer");
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;

			}
			System.out.println("");
		}

		System.out.println("two");
		int l = 1;
		for (int i = 0; i < 5; i++) {

			// System.out.println("outer");
			for (int j = 1; j <= i; j++) {
				System.out.print(l);
				System.out.print("\t");
				l++;

			}
			System.out.println("");
		}
		System.out.println("three");
		// int k = 1;
		for (int i = 0; i < 4; i++) {

			// System.out.println("outer");
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(j);
				System.out.print("\t");
				// k++;

			}
			System.out.println("");

		}
		System.out.println("four");
		// int k = 1;
		for (int i = 0; i < 5; i++) {

			// System.out.println("outer");
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				System.out.print("\t");
				// k++;

			}
			System.out.println("");

		}
		String n="*";
		System.out.println("five");
		
		for (int i = 0; i < 5; i++) {

			// System.out.println("outer");
			for (int j = 1; j <= i; j++) {
				System.out.print(n);
				System.out.print("\t");
				 

			}
			System.out.println("");
	}
}}
