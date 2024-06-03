package lesson03;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
//		1. 무한 입력
//		무한 루프를 통해서 반복적으로 수를 입력을 받고 0이 입력 되었을때 반복문을 빠져 나오게 하세요.
//		입력이 끝나면 "끝"을 출력하세요
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("수를 입력하세요:");
			int num = scan.nextInt();
			if (num == 0) {
				System.out.print("끝");
				break;
			}
		}
		System.out.println();
		
//		2. 배수의 합 구하기
//		3부터 50까지 3의 배수의 합을 출력하세요.
//		증감 연산은 +1씩 하세요.
//		continue문을 사용하세요
		int sum = 0;
		for (int i = 3; i <= 50; i++) {
			if (i % 3 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}
}
