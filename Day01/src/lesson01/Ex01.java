package lesson01;

public class Ex01 {

	public static void main(String[] args) {
		// 정수형 변수(Integer)
		int number = 10; // 변수에 값 넣기: 초기화, 할당, 대입, 저장, assign
		System.out.println(number);
		
		number = 5; // 변수이므로 값 변경 가능. 재사용 시 자료형 생략
		System.out.println(number);
		
		int number2 = 100;
		int sum = number + number2;
		System.out.println(sum);
		
		// 소수 변수(Float) : 권장 안함. 오차가 커질 수 있다.
		float f = 1.555555555f;
		System.out.println(f);
		
		double d = 1.555555555;
		System.out.println(d * number2);
		
		// 문자 변수(Character) : 문자 한개. 작은 따옴표로 감싼다.
		char c = 'z';
		System.out.println(c);
		
		//boolean 변수 : 참(true), 거짓(false)
		boolean isReal = true;
		boolean isFalse = false;
		System.out.println(isReal);
		System.out.println("거짓이다. " + isFalse);
		
	}

}
