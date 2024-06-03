package lesson01;

public class Quiz01 {

	public static void main(String[] args) {
//		이름: 신보람 나이: 25
//
//		3 + 5 = 8
//		3 - 5 = -2
//
//		7 X 1 = 7
//		7 X 2 = 14
//		7 X 3 = 21
		String name = "신보람";
		int age = 25;
		System.out.println("이름: " + name + " 나이: " + age);
		System.out.println();
		
		int num1 = 3;
		int num2 = 5;
		int sum = num1 + num2;
		int minus = num1 - num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " - " + num2 + " = " + minus);
		System.out.println();
		
		int number = 7;
		
		int result = number * 1;
		System.out.println(number + " X 1 = " + result);
		result = number * 2;
		System.out.println(number + " X 2 = " + result);
		result = number * 3;
		System.out.println(number + " X 3 = " + result);
		
	}

}
