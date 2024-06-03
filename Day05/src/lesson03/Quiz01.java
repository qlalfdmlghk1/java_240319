package lesson03;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		1. 반복 출력
//		수를 입력 받아서 그 수만큼 "화이팅!!!" 를 출력하세요
//		입력 예시
//		횟수를 입력하세요 : 4
//		출력 예시
//		화이팅!!!
//		화이팅!!!
//		화이팅!!!
//		화이팅!!!
//		System.out.print("횟수를 입력하세요 : ");
//		int cnt = scan.nextInt();
//		while (cnt > 0) {
//			System.out.println("화이팅!!!");
//			cnt -= 1;
//		}
		
		
//		2. 카운트 다운 "발사"
//		수를 입력 받고 그 수에서 부터 0까지 한 줄씩 카운트 다운을 출력 하고 마지막에 "발사"를 출력하세요.
//		입력 예시
//		카운트 다운 수를 입력하세요 : 3
//		출력 예시
//		3
//		2
//		1
//		0
//		발사 
//		System.out.print("카운트 다운 수를 입력하세요 : ");
//		int count = scan.nextInt();
//		while (count >= 0) {
//			System.out.println(count);
//			count -= 1;
//			}
//		System.out.println("발사");
		
		
//		3. 반복 입력
//		while을 이용하여 5번 동안 수를 입력 받고 출력하세요.
		int i = 5;
		while (i > 0) {
			System.out.print("수를 입력하세요 : ");
			int number = scan.nextInt();
			System.out.println(number);
			i -= 1;
		}

		
//		4. 구구단
//		구구단 3단을 출력하세요
//		출력 예시
//		3 X 1 = 3
//		int num = 3;
//		int i = 1;
//		while (i <= 9) {
//			System.out.println(num + " X " + i + " = " + (num*i));
//			i += 1;
//		}		
	}
}

