package lesson08;

public class Quiz01 {

	public static void main(String[] args) {
		String birthday = "1995";
		int year = Integer.valueOf(birthday);
		int old = 2024 - year;
		System.out.println(old + "세");
	}
}
