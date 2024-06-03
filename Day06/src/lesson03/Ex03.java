package lesson03;

public class Ex03 {

	public static void main(String[] args) {
		// break문: break문이 써진 곳의 가장 가까운 반복문에서 빠져나온다.
		
		// 무한루프에서 hello world 5번 찍기
		int i = 0;
		while (true) { // 0 1 2 3 4
			if (i == 5) {
				break; 
			}
			System.out.println("hello world" + i);
			i++;
		}
		
		// for문 무한루프
		for (int j = 0; true; j++) {
			if (j == 5) {
				break;
			}
			System.out.println("Hello world!" + j);
		}
		
		// continue: skip. 아래 코드들을 수행하지 않고 조건을 보러간다.
		
		// 1 ~ 10까지 수 중에서 4의 배수일 때는 출력하지 않기
		// 1 2 3 5 6 7 9 10
		// 1) if문 처리
		for (int j = 1; j <= 10; j++) {
			if (j % 4 != 0) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
		
		// 2) continue문으로 처리
		for (int j = 1; j <= 10; j++) { // 1 2 3 
			//언제 출력을 skip할 것인가? => 4의 배수
			if (j % 4 == 0) {
				continue; // 아래 코드 스킵 => 조건으로 감
			}
			System.out.print(j + " ");
		}
	}
}
