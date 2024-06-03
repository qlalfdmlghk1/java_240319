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
		int number1 = 1;
		int number2 = 2;
		int number3 = 3;
		int result1 = number * number1;
		int result2 = number * number2;
		int result3 = number * number3;
		System.out.println(number + " X " + number1 + " = " + result1);
		System.out.println(number + " X " + number2 + " = " + result2);
		System.out.println(number + " X " + number3 + " = " + result3);
		
	}

}
