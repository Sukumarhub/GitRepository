package week1.homework;

public class ArithmaticOperations {

	int numberOne = 20 ;
	int numberTwo = 10 ;
	
	public void addition() {
		System.out.println(numberOne + numberTwo);
	}
	
	public int subtract() {
		int sub = numberOne - numberTwo;
		System.out.println(sub);
		return sub;
	}
	
	public int multiply() {
		int multiplication = numberOne * numberTwo;
		System.out.println(multiplication);
		return multiplication;
	}
	
	public void multiplyNumberOneByTwo() {
		System.out.println(numberOne * 2);
	}
	
	 public int divideNumberTwoBy(int divident) {
		 int division = numberTwo / divident ;
		System.out.println(division);
		return divident;}
	
}
