package week1.homework;

import java.util.Scanner;

public class OperatorsExamples {

	public static void main(String[] args) {
		
//		arithmatic();
//		bitwise();
//		relational();
//		incrementanddecrement();
		ternary();
	}


	private static void arithmatic() {
		// TODO Auto-generated method stub
	
		System.out.println("Enter the first Value:");
		Scanner scan1  = new Scanner(System.in);
		int x= scan1.nextInt();

		System.out.println("Enter the second Value:" );
		Scanner scan2  = new Scanner(System.in);
		int y= scan2.nextInt();
		System.out.println("Arithmatic operators:");
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y);
		System.out.println(x*y);
		System.out.println(x%y);
	}

	private static void bitwise() {
		// TODO Auto-generated method stub
		System.out.println("Bitwise operators:");
		System.out.println("Enter the first Value:");
		Scanner scan1  = new Scanner(System.in);
		int x= scan1.nextInt();

		System.out.println("Enter the second Value:" );
		Scanner scan2  = new Scanner(System.in);
		int y= scan2.nextInt();
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		System.out.println(~x);
		System.out.println(x<<y);
	}
		private static void relational() {
			// TODO Auto-generated method stub
			System.out.println("relational operators:");
			System.out.println("Enter the first Value:");
			Scanner scan1  = new Scanner(System.in);
			int x= scan1.nextInt();

			System.out.println("Enter the second Value:" );
			Scanner scan2  = new Scanner(System.in);
			int y= scan2.nextInt();
			System.out.println(x>y);
			System.out.println(x<y);
			System.out.println(x!=y);
			System.out.println(x==y);
			System.out.println(x>=y);
			System.out.println(x<=y);
	}
		
		private static void incrementanddecrement() {
			// TODO Auto-generated method stub
			System.out.println("Incrementanddecrement operators:");
			System.out.println("Enter the first Value:");
			Scanner scan1  = new Scanner(System.in);
			int x= scan1.nextInt();

			System.out.println(x++);
			System.out.println(x--);
			System.out.println(++x);
			System.out.println(--x);			
	}
		private static void ternary() {
			// TODO Auto-generated method stub
			System.out.println("Incrementanddecrement operators:");
			int a;
			boolean b;
			 a = 10;
			 b=(a==1)? true:false;
			System.out.println(b);
			 b=(a==10)? true:false;
			System.out.println(b);
	}
	

}
