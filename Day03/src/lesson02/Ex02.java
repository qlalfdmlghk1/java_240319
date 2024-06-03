package lesson02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//논리 연산자(그리고, 또는)
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("숫자를 입력하세요:");
//		int number = scan.nextInt();
//		
//		// number가 10 이상이고(그리고,and) 40 이하이다. 10 <= number <= 40
//		if (number >= 10 && number <= 40) {
//			System.out.println("number가 10 이상이고(그리고) 40 이하이다.");
//		}
//		
//		// number가 10보다 작거나(또는,or) 40보다 크다. number < 10 또는 number > 40
//		if (number < 10 || number > 40) {
//			System.out.println("number가 10보다 작거나(또는,or) 40보다 크다.");
//		}
		
		// 걸은수, 몸무게
		System.out.print("걸은 수와 몸무게를 입력하세요:");
		int step = scan.nextInt();
		int weight = scan.nextInt();
		
		// 만약에 걸은 수가 만보를 초과하면서 몸무게는 70키로 이하일 때 족발
		if (step > 10000 && weight <= 70) {
			System.out.println("둘 다 만족하니 족발 먹자");
		}
		
		// 만약에 걸은 수가 만보를 초과하거나 몸무게가 70키로 이하일 때 치맥
		if (step > 10000 || weight <= 70) {
			System.out.println("하나라도 만족하니 치맥먹자");
		}
	}

}
