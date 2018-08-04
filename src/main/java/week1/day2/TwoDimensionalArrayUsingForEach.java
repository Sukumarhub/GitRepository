package week1.day2;

public class TwoDimensionalArrayUsingForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] studentList = {"Ravi","Ram","Rahul","Raja","Rahim"};
		int[] studentAge = {21,22,23,22,22};

		for(String name : studentList)
		{
			System.out.println("Name of the Student: " + name);
			System.out.println("NameLength of the Student: " + name.length());
			
		}
		
		for(int age : studentAge)
		{
			System.out.println("Age of the Student: " + age);
			
		}

	}

}


