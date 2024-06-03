package lesson01;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 입력하기
		// import 단축키 : ctrl + shift + o
		Scanner scan = new Scanner(System.in);
		
		System.out.print("육개장의 가격을 입력하세요:");
		int noodleCup = scan.nextInt(); // 숫자 입력
		System.out.println("육개장 가격은 " + noodleCup + "원");
		
		System.out.print("육개장 개수를 입력하세요:");
		int count = scan.nextInt();
		// 육개장 n개의 가격은 OO원
		int sum = noodleCup * count;
		
		System.out.println("육개장 " + count + "개의 가격은 " + sum + "원");
		
		scan.close();
		
	}
}
