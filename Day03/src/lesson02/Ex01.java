package lesson02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 조건문(if문)과 비교 연산자 사용
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("몸무게를 입력하세요:");
//		int weight = scan.nextInt();
//		
//		// 만약에 몸무게가 70키로 미만이면 "치킨"
//		if (weight < 70) {
//			System.out.println("치킨 먹자");
//		}
//		
//		// 만약에 몸무게가 100키로 이상이면 "다이어트"
//		if (weight >= 100) {
//			System.out.println("다이어트");
//		}
//		
//		// 만약에 몸무게가 68키로 이면 "68키로이다"
//		if (weight == 68) {
//			System.out.println("68키로이다");
//		}
//		
//		// 만약에 몸무게가 75키로가 아니면 "75키로가 아니다"
//		if (weight != 75) {
//			System.out.println("75키로가 아니다");
//		}
		
		// 두 숫자를 입력받고 비교
		System.out.print("두 개의 수를 입력하세요:"); // 3 5
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		// n1이 n2보다 크다
		if (n1 > n2) {
			System.out.println("n1이 크다.");
		}
		
		// n1이 n2보다 작다
		if (n1 < n2) {
			System.out.println("n1이 작다.");
		}
		
		// n1과 n2가 같다
		if (n1 == n2) {
			System.out.println("n1과 n2는 같다.");
		}
		
		// n1과 n2는 다르다
		if (n1 != n2) {
			System.out.println("n1과 n2는 다르다.");
		}
	}

}
