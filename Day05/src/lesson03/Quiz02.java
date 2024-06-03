package lesson03;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
//		1. 반복 출력
//		35 ~ 40 까지 출력 하세요
//		출력 예시
//		35 36 37 38 39 40
		for (int i = 35; i <= 40; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		2. 카운트 다운 출력
//		5 ~ -5 까지 출력하세요
//		출력 예시
//		5 4 3 2 1 0 -1 -2 -3 -4 -5
		for (int i = 5; i >= -5; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		3. 특정 조건 구하기
//		1 ~ 50 사이에 3의 배수만 출력하세요.
//		출력 예시
//		3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48
		for (int i = 3; i <= 50; i += 3) {  // 1부터 모두 순환하는 것보다 효율성 측면에서 더 좋은 코드
			System.out.print(i + " ");
		}
		System.out.println();
		
//		4. 개수 세기
//		1 ~ 100 사이에 7의 배수 개수를 구하세요.
//		출력 예시
//		7의 배수의 개수는 : 14
		int cnt = 0;
		for (int i = 7; i <= 100; i += 7) {
				cnt += 1;
		}
		System.out.println("7의 배수의 개수는 : " + cnt);
		
//		5. 구구단
//		수를 입력 받아서 해당하는 단수의 구구단을 출력 하세요.
//		입력 예시
//		단수를 입력하세요 : 8
//		출력 예시
//		8 X 1 = 8
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단수를 입력하세요:");
		int num = scan.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
	}
}
