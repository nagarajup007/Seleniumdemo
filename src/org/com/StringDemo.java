package org.com;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
     String s=" Hello ";//Stored in string poor
     String s1="hello";
     String i="176";
     String s3=new String("Hello world");// stored in heap memory
     String s4=new String("hello world");
     System.out.println(s3.length());
     System.out.println(Integer.valueOf(i));
     System.out.println(s.isEmpty());
     System.out.println(s.charAt(4));
     System.out.println(s.concat("h").trim());
     System.out.println(s.equalsIgnoreCase("hello"));
     System.out.println(s.contains("e"));
     System.out.println(s.contentEquals("Hello"));
     System.out.println(s.startsWith("He"));
     System.out.println(s.trim());
     System.out.println(s.length());
     System.out.println(s.isBlank());
     System.out.println(s3.split(""));
     System.out.println(Arrays.toString(s3.split(" ")));
     System.out.println(s.substring(2,4));
     System.out.println(s4.replace("hello", "when"));
     
     
     
     
     
     
     
     
     
     
     
     
     

     
	}

}
