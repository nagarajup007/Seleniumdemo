package org.com;

public class SwitchCase {

	public static void main(String[] args) {
int i=2;

switch (i) { //switch is value based statement
case 1:
	System.out.println("This is First statement");
	break;
case 2:
	System.out.println("This is second statement");
	break;
case 3:
	System.out.println("This is third statement");
	break;
case 4:
	System.out.println("This is fouth statement");
	break;

default:
	System.err.println("invalid input");
	break;
}





int day = 8;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
  default:
		System.err.println("invalid input");
		break;
}

	}

}
