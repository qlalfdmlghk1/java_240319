package lesson03;

public class Ex01 {

	public static void main(String[] args) {
		// 안녕 3번 쓰기
//		System.out.println("안녕");
//		System.out.println("안녕");
//		System.out.println("안녕");
		
		// while문을 이용해서 "안녕" 3번 출력
		int i = 0; //카운팅을 위한 변수 i, j, k
		while (i < 3) { // 0 1 2	3
			System.out.println("안녕" + i);
			//i += 1; // 복합 대입 연산자
			//++i; // 증감 연산자(전위)
			i++; // 증감 연산자(후위)
		}
		
		// ++i, i++ 차이점
		int number = 1;
		System.out.println("number:" + number); // 결과:1
		System.out.println("number:" + (++number)); // 결과:2
		System.out.println("number:" + (number++)); // 결과:2
		System.out.println("number:" + number); // 결과:3
		
		// 0 ~ 4 : 5번
		i = 0; // 카운팅
		while (i < 5) { // 0 1 2 3 4
			System.out.println("딸기 " + i);
			i++;
		}
		
		// 1 ~ 5: 5번
		i = 1; // 시작값
		while (i <= 5) { // 1 2 3 4 5
			System.out.println("블루베리" + i);
			i++;
		}
		
		i = 5; // 시작값
		while (i >= 0) { // 5 4 3 2 1 0 
			System.out.println("복숭아" + i);
			i--;
		}
		
		// 1+2+3+4+5+6+7+8+9+10 => 합계
		i = 1; // 시작값
		int sum = 0;
		while (i <= 10) { // 1 ~ 10
			sum = sum + i; 
			i++;
		}
		System.out.println(sum);
	}
}
