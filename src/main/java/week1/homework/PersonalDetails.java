package week1.homework;

public class PersonalDetails {

	public static void main(String[] args) {
		PersonalDetails details = new PersonalDetails();
		System.out.println("Details of Myself");
		details.personal("Sukumar",25 ,"Green");
		System.out.println("Details of my First Friend");
		details.friend1("suren", 25, "Blue");
		System.out.println("Details of Second Friend");
		details.friend2("Sakthi", 25, "Orange");
	}

	void personal(String name, int age, String favoriteColor) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(favoriteColor);
	}
	void friend1(String name, int age, String favoriteColor) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(favoriteColor);
	}
	void friend2(String name, int age, String favoriteColor) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(favoriteColor);
	}
}
