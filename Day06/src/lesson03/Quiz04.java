package lesson03;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
//		1. 합 구하기
//		수를 입력 받아서 1부터 입력 받은 수까지의 합을 출력하세요.
//		입력 예시
//		수를 입력하세요 : 45
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
		
//		2. 팩토리얼
//		팩토리얼은 1부터 그 수까지의 모든 수의 곱이고 아래와 같이 표현된다.
//		5! = 1 * 2 * 3 * 4 * 5
//		7! = 1 * 2 * 3 * 4 * 5 * 6 * 7
//		수를 입력 받고 그 수의 팩토리얼을 출력하세요.
//		입력 받는 수의 최대값은 10이다.
//		입력 예시
//		수를 입력하세요 : 8
		System.out.print("수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int fac = 1;
		for (int j = 2; j <= num1; j++) {
			fac *= j;
		}
		System.out.println(fac);
		
//		3. 약수 구하기
//		수를 입력 받아서 그 수의 약수를 모두 출력하세요.
//		약수: 어떤 수를 나누어 떨어지게 하는 수
//		예) 8의 약수 => 1 2 4 8
//		입력 예시
//		수를 입력하세요 : 24
		System.out.print("수를 입력하세요 : ");
		int num2 = scan.nextInt();
		for (int k = 1; k <= num2; k++) {
			// 약수 : 입력받은 number를 i로 나눈 나머지가 0이면 i는 약수
			if (num2 % k == 0) {
				System.out.print(k + " ");
			}
		}
	}
}
