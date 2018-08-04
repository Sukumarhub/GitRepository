package week1.homework;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter any of the below values: \n 1.Passed \n 2.Failed \n 3.Blocked \n 4.Invalid");
Scanner scan = new Scanner(System.in);
String details = scan.next();
switch (details) {
case "Passed":
	System.out.println("The condition is Passed");
	break;
case "Failed":
	System.out.println("The condition is Failed");
	break;
case "Blocked":
	System.out.println("The condition is Blocked");
	break;
case "Invalid":
	System.out.println("The condition is Invalid");
	break;
default:
	System.out.println("the condition is mismatched");
	break;
}
	}

}
