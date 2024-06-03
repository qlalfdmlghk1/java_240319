package lesson05;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		2. 최소값
//		5개의 수를 입력 받아서 최소값을 출력하는 함수를 만드세요.(리턴값 없음)
//		입력 가능한 최대값은 1000 입니다.
//		입력 예시
//		5개의 수를 입력하세요 : 4 29 9 398 -4
//		출력 예시
//		최소값은 -4
//		System.out.print("5개의 수를 입력하세요 : ");
//		int n1 = scan.nextInt();
//		int n2 = scan.nextInt();
//		int n3 = scan.nextInt();
//		int n4 = scan.nextInt();
//		int n5 = scan.nextInt();
//		printMinValue(n1,n2,n3,n4,n5);
		
//		3. 소수(prime) 판별
//		소수: 1과 자기자신 이외에 나누어 떨어지지 않는 수이다.
//		수를 입력 받고 그 수가 소수(prime)인지 아닌지 리턴하는 함수를 만들고 호출하세요.
//		소수이면 true, 소수가 아니면 false를 리턴
//		단, 입력하는 수는 2 이상
//		입력 예시
//		수를 입력하세요 : 22
//		출력 예시
//		false
		System.out.print("수를 입력하세요:");
		int number = scan.nextInt();
		System.out.println(isPrimeNumber(number));
	}

	// 2.
	// input:5개 숫자(int) output:X
	public static void printMinValue(int n1, int n2, int n3, int n4, int n5) {
		// int min = Integer.MAX_VALUE;
		int min = n1;
		if (min > n2) {
			min = n2;
		}
		if (min > n3) {
			min = n3;
		}
		if (min > n4) {
			min = n4;
		}
		if (min > n5) {
			min = n5;
		}
		System.out.println(min);
	}
	
	// 3.
	// input: int	 output: boolean 소수-true 아니면 false
	public static boolean isPrimeNumber(int number) {
		// 2보다 큰 수를, 2부터 number보다 하나 작은 수까지 나눠본다.
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				// 하나라도 나누어 떨어지면 소수가 아니다.
				return false;
			}
		}
		// 이곳까지 도달하면 무조건 소수이다.
		// 1. 나누어 떨어지는 수가 없었거나
		// 2. 2여서 반복문에 들어가지 않는 경우
		return true;
	}

}
