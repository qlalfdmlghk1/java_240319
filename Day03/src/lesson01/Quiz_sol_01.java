package lesson01;

import java.util.Scanner;

public class Quiz_sol_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		4. 자리수 쪼개기
//		네 자리수 숫자를 입력 받아서 천의 자리부터 한줄씩 출력 하세요.
//		입력 예시
//		입력 : 1234
		System.out.print("입력 : ");
		int number = scan.nextInt();
//		int q = number / 1000;   // 1
//		int r = number % 1000;   // 234
//		System.out.println(q);   // 1
//		
//		q = r / 100;   // 2
//		r = r % 100;   // 34
//		System.out.println(q);   // 2
//		
//		q = r / 10;   // 3
//		r = r % 10;   // 4
//		System.out.println(q);   // 3
//		
//		System.out.println(r);   // 4
	
		
//		5. 자리수 합 구하기
//		네 자리수를 입력 받아서 각 자리수의 합을 출력하세요.
//		입력 예시
//		입력 : 1234
//		출력 예시
//		합계는 10 입니다.
		int n1 = number / 1000;  // 1234 / 1000 => 1
		int n2 = number % 1000 / 100;  // 1234 % 1000 -> 234 / 100 => 2  
		int n3 = number % 100 / 10;  // 34 / 10 => 3
		int n4 = number % 10;  // 1234 % 10 => 4
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		int sum = n1 + n2 + n3 + n4;
		System.out.println("합계는 " + sum + "입니다.");
	}
}
