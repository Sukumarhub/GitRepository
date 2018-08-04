package week1.day2;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] numArray = {22,120,420,-22,80};
		int num = numArray[0];
		
		for(int largestNum: numArray) {
		if(	largestNum>num) {
		num = largestNum;
		}
		}
		System.out.println(num);
	}
	
	
}





