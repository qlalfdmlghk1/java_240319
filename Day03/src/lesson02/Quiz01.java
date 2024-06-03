package lesson02;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
//		1. 숫자 비교
//		숫자를 입력 받아서 10보다 작은 수인지 큰 수인지, 같은지를 출력하세요.
//		입력 예시
//		숫자를 입력하세요 : 25
//		출력 예시
//		10보다 큽니다.
		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int number = scan.nextInt();
//		if (number < 10) {
//			System.out.println("10보다 작은 수 입니다.");
//		} else if (number > 10) {
//			System.out.println("10보다 큰 수 입니다.");
//		} else {
//			System.out.println("10과 같은 수 입니다.");
//		}
		
		
//		2. 수 비교
//		두 숫자 a, b 를 입력 받아서 a가 클 경우 "a가 더 큽니다." 를
//		b가 클 경우 "b가 더 큽니다."를
//		같을 경우 "a와 b는 같습니다."를 출력하세요
//		입력 예시
//		두 개의 수를 입력하세요 : 43 22
//		출력 예시
//		a가 더 큽니다.
//		System.out.print("두 개의 수를 입력하세요 : ");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		if (a > b) {
//			System.out.println("a가 더 큽니다.");
//		} else if (a < b) {
//			System.out.println("b가 더 큽니다.");
//		} else {
//			System.out.println("a와 b는 같습니다.");
//		}
		
		
//		3. 시험 합격
//		70점 이상이면 합격하는 시험에서 점수를 입력 받아서 합격 여부를 출력하세요.
//		입력 예시
//		성적을 입력하세요 : 86
//		출력 예시
//		합격입니다.
//		System.out.print("성적을 입력하세요 : ");
//		int score = scan.nextInt();
//		if (score >= 70) {
//			System.out.println("합격입니다.");
//		}
		
			
//		4. 홀짝 검사
//		수를 입력 받아서 짝수 인지 홀수 인지 출력하세요.
//		입력 예시
//		수를 입력하세요 : 4
//		출력 예시
//		짝수
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		
		boolean isEven = num % 2 == 0;
		
		if (isEven) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
	}
}
