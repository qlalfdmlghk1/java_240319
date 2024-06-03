package lesson04;

public class Quiz01 {

	public static void main(String[] args) {
//		1. 주사위 문제
//		두 개의 주사위를 굴렸을 때, 나올 수 있는 모든 경우의 수를 출력하세요.
//		출력 예시
//		(1, 1) (1, 2) (1, 3) (1, 4) (1, 5) (1, 6)  
//		(2, 1) (2, 2) (2, 3) (2, 4) (2, 5) (2, 6) 
//		(3, 1) (3, 2) (3, 3) (3, 4) (3, 5) (3, 6) 
//		(4, 1) (4, 2) (4, 3) (4, 4) (4, 5) (4, 6) 
//		(5, 1) (5, 2) (5, 3) (5, 4) (5, 5) (5, 6) 
//		(6, 1) (6, 2) (6, 3) (6, 4) (6, 5) (6, 6)
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("(" + i + ", " + j + ") ");
			}
			System.out.println();
		}
		
//		2. 구구단
//		구구단을 2단에서 부터 9단 까지 모두 출력하세요.
//		출력 예시
//		2 X 1 = 2
//		2 X 2 = 4
//		2 X 3 = 6
//		2 X 4 = 8
//		2 X 5 = 10
//		2 X 6 = 12
//		2 X 7 = 14
//		2 X 8 = 16
//		2 X 9 = 18
//		3 X 1 = 3 ...
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			} 
		}
		

//		3. 별찍기
//		아래 형태처럼 *을 출력하세요
//		출력 예시
//		*			1행 1개
//		**			2행 2개
//		***			3행 3개
//		****		4행 4개
//		*****		5행 5개
		for (int i = 0; i <= 4; i++) {
			for (int j = 5-i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
//		4. 거꾸로 된 삼각형
//		아래 형태처럼 *을 출력하세요.
//		출력 예시
//		*****		행:5
//		****		행:4
//		***			행:3
//		**			행:2
//		*			행:1
		for (int i = 4; i >= 0; i--) { 
			for (int j = 5-i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 5; i >= 1; i--) { // 행i : 5 4 3 2 1
			for (int j = 0; j < i; j++) { // 열(별의 개수)j
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		System.out.println();
		
//		5. 피라미드
//		아래 형태처럼 *을 출력하세요.
//		출력 예시
//		----*----		별1
//		---***---		별3
//		--*****--		별5
//		-*******-		별7
//		*********		별9
		for (int i = 0; i < 5; i++) { // 행i 0 ~ 4
			// 공백 
			for (int j = 0; j < 4-i; j++) { // 열(공백) 0 ~ 
				System.out.print(" ");
			}
			// 별
			// 짝수:2n	홀수:2n+1 or 2n-1
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			// 줄바꿈
			System.out.println();
		}
		
	}

}
