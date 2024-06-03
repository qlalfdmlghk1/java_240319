package lesson05;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		1. 합 구하기
//		수를 입력 받아서 1에서 부터 그 수 까지의 합을 구하는 함수를 만드세요.
//		단, 합이 100이 넘으면 합을 중단하고 그 때 까지의 합을 리턴하세요.
//		입력 예시
//		수를 입력하세요 : 85
//		출력 예시
//		105
		System.out.print("수를 입력하세요 : ");
		int end = scan.nextInt();
		System.out.println(getSumUntil100(end));
	}
	
	// input: int(끝값)
	// output: int(결과값)
	public static int getSumUntil100(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (sum > 100) {
				// break;
				return sum;
			}
		}
		return sum;
	}
}

