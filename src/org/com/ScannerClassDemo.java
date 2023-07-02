package org.com;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//getting output  from user 
		System.out.println("What is your name:?");
		String name = sc.nextLine();
		System.out.printf("Hey %s , how are you: ? \n", name);
		String Status = sc.nextLine();
		System.out.println("what is age:?");
		int nextInt = sc.nextInt();
		System.out.println("Thank you for the information");
	}

}
