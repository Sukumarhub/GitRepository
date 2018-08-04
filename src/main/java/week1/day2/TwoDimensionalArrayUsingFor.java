package week1.day2;

import java.util.Scanner;

public class TwoDimensionalArrayUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] studentList = {"Ravi","Ram","Rahul","Raja","Rahim"};
		int[] studentAge = {21,22,23,22,22};
		char[][] grade = {{'A','B','C','D','E'}, {'A','A','A','A','A'}, {'E','E','E','E','E'},
				{'B','B','B','B','B'},{'C','C','C','C','C'}};
		//		System.out.println("Provide the student data :");


		int i = 0;

		for(i=0;i<=4;i++)
		{
			System.out.println(studentList[i] + " who is " + studentAge[i] + " years old scored " 
					+ grade [i][0]
							+ grade [i][1]
									+ grade [i][2]
											+ grade [i][3]
													+ grade [i][4]);
		}


	}


}
