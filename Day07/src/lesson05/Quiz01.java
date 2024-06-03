package lesson05;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		1. 2의 제곱 함수
//		정수를 입력 받아서 2제곱의 결과를 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//		hint ) 함수 원형 - public static int getSquared(int x)
//		입력 예시
//		제곱값을 구할 숫자를 입력하세요: 5
//		출력 예시
//		5의 제곱은 25이다.
		System.out.print("제곱값을 구할 숫자를 입력하세요: ");
		int num = scan.nextInt();
		System.out.println(num + "의 제곱은 " + getSquared(num) + "이다.");
		
//		2. 평균 구하기 함수
//		4개의 값을 받아서 평균을 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//		hint ) 함수 원형 - public static double getAverage(int score1, int score2, int score3, int score4)
//		입력 예시
//		점수를 입력하세요: 85 72 65 99
//		출력 예시
//		평균은 80.25	
		System.out.print("점수를 입력하세요: ");
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		int s3 = scan.nextInt();
		int s4 = scan.nextInt();
		System.out.println("평균은 " + getAverage(s1,s2,s3,s4));
		
//		3. 몫과 나머지 출력 함수
//		두 수를 받아서 몫과 나머지를 출력하는 함수를 만드세요. (리턴값 없음)
//		hint ) 함수 원형 - public static void printQuotientRemainder(int number1, int number2)
//		입력 예시
//		숫자와 나눌 수를 입력하세요: 20 7
//		출력 예시
//		몫: 2
//		나머지: 6
		System.out.print("숫자와 나눌 수를 입력하세요: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		printQuotientRemainder(num1,num2);
		
//		4. 홀짝 함수
//		정수를 입력 받아서 짝수면 true 홀수면 false를 돌려 주는 함수를 만드세요.
//		입력 예시
//		숫자를 입력하세요: 6
//		출력 예시
//		true
		System.out.print("숫자를 입력하세요: ");
		int number = scan.nextInt();
		System.out.println(isEven(number));
	}
	
	
	public static int getSquared(int x) {
		return (x*x);		
	}
	
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		return (double) (score1 + score2 + score3 + score4) / 4;
	}
	
	
	public static void printQuotientRemainder(int number1, int number2) {
		int div = number1 / number2;
		int mod = number1 % number2;
		System.out.println("몫: " + div);
		System.out.println("나머지: " + mod);
	}
	
	
	public static boolean isEven(int x) {
//		if (x % 2 == 0) {
//			return true;
//		}
//		return false;
		
		// 삼항 조건문, 삼항 연산자
		return x % 2 == 0 ? true : false;
	}
}
