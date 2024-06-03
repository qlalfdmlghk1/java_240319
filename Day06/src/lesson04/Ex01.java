package lesson04;

public class Ex01 {

	public static void main(String[] args) {
		// 중첩 반복문(Nested Loop)
		// 바깥 반복문: 천천히 돈다. (세트, 행)
		// 안쪽 반복문 : 빨리 돈다.(횟수, 열)
		
		// 스쿼트 10회
		for (int i = 1; i <= 10; i++) {
			System.out.println("스쿼트 " + i + "회");
		}
		
		// 스쿼트 3세트 10회
		for (int i = 1; i <= 3; i++) { // i: 1 2 3
			for (int j = 1; j <= 10; j++) { // j: 1 ~ 10
				System.out.println("스쿼트 " + i + "세트째, " + j + "회");
			}
		}
		
		// 한줄짜리 별 5개 찍기
		// *****
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		
		System.out.println("\n");

		// 한줄짜리 별 5개, 3개 행 출력
		// *****
		// *****
		// *****
		for (int i = 0; i < 3; i++) { // 행i: 0 1 2
			for (int j = 0; j < 5; j++) { // 열j: 0 1 2 3 4
				System.out.print("*");
			}
			System.out.println(); // 한 행이 끝나는 시점에 줄바꿈
		}
	}

}
