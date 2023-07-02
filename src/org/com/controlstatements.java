package org.com;

import java.util.Scanner;

public class controlstatements {
	 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		

		System.out.println("what is your 1st round status");
		String roundone = sc.next();
		
		
if (roundone.contains("pass")) {
	
	System.out.println("Congractulation wait for 2nd round");
	
	
	System.out.println("what is your 2st round status");
	int nextInt = sc.nextInt();
	if (nextInt>=18){
		System.out.println("Congractulation wait for HR round");
	}else {
		System.out.println("Fail 2nd round");
	}
	
} else {
System.out.println("Fail 1st round");
}
	}

}
