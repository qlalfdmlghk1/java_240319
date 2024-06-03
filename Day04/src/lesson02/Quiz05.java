package lesson02;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
//		4. 윤년 구하기
//		연도를 입력 받아서 윤년인지 평년인지 출력하세요.
//		윤년 조건
//		4로 나누어 떨어지는 연도는 윤년이다.
//		100으로 나누어 떨어지는 연도는 윤년이 아니다.
//		400으로 나누어 떨어지는 연도는 무조건 윤년이다.
//		4-1) 비효율적인 방식
		Scanner scan = new Scanner(System.in);
		System.out.print("연도:");
		int year = scan.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("윤년");
				} else {
					System.out.println("평년");
				}
			} else {
				System.out.println("윤년");
			}
		} else {
			System.out.println("평년");
		}
		
//		4-2) if - else if - else
		
//		윤년 조건
//		4로 나누어 떨어지는 연도는 윤년이다.
//		100으로 나누어 떨어지는 연도는 윤년이 아니다.
//		400으로 나누어 떨어지는 연도는 무조건 윤년이다.
		if (year % 400 == 0) {
			System.out.println("윤년");
		} else if (year % 100 == 0) { // 400의 배수가 아님
			System.out.println("평년");
		} else if (year % 4 == 0) { // 400의 배수나 100의 배수가 아님
			System.out.println("윤년");
		} else { // 4의 배수, 400의 배수, 100의 배수 아님
			System.out.println("평년");
		}
		
		
//		4-3) 
		
//		윤년 조건
//		4로 나누어 떨어지면서(그리고) 100으로 나누어 떨어지지 않는 연도는 윤년이다.
//		(또는)
//		400으로 나누어 떨어지는 연도는 무조건 윤년이다.
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))  {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
	}
}
