package week1.day2;

import java.util.Scanner;

public class LearningTwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] studentList = {"Ravi","Ram","Rahul","Raja","Rahim"};
		int[] studentAge = {21,22,23,22,22};
		char[][] grade = {{'A','B','C','D','E'}, {'A','A','A','A','A'}, {'E','E','E','E','E'},
				{'B','B','B','B','B'},{'C','C','C','C','C'}};
		System.out.println("Provide the student data :");
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();
		index = index-1;
		
		System.out.println(studentList[index] + " who is " + studentAge[index] + " years old scored " 
		+ grade [index][0]
		+ grade [index][1]
		+ grade [index][2]
		+ grade [index][3]
		+ grade [index][4]);
	}

}
