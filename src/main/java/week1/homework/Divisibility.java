package week1.homework;

public class Divisibility {
	static int a = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisibility div = new Divisibility();
		
		if (a%2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		div.prime();

	}

	void prime() {
		for(int i=2;i<a;i++) {
			if (a%i==0 || a==i) {
				System.out.println("Number is Not Prime");
			}
			else {
				System.out.println("Number is Prime");
			}
			break;
		}
	}

}
