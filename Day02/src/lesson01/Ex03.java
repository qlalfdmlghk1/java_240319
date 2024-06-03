package lesson01;

public class Ex03 {

	public static void main(String[] args) {
		// 자료형(data type) 변환 => casting
		double pi = 3.94;
		int intPi = (int) pi;  
		System.out.println(intPi); // double -> int : 소수점 뒷자리 버림
		System.out.println((double)intPi); // int -> double: .0이 붙음
		
		int number = 7;
		double result = number / 2;  // int / int => in  예상값:3.5, 결과:3 -> 3.0
		System.out.println(result);
		
		// 1. 둘 중 하나의 값을 소수로 형변환
		result = number / (double)2;
		System.out.println(result);
		
		// 2. 소수로 나눈다.
		result = number / 2.0;
		System.out.println(result);
		
		// 반올림 하는법
		// Math.round(소수) 3.14 => 3	3.8 => 4
		pi = 3.141592653;
		System.out.println(Math.round(pi));
		
		// 둘째자리까지 반올림하기
		// 1. pi에 100을 곱해서 314.1592653 만든다.
		// 2. 소수점 첫째자리에서 반올림하고 정수로 만든다.(round 적용) => 314
		// 3. 3.14로 만들기 위해 100.0을 나누어 준다.
		System.out.println(Math.round(pi * 100) / 100.0);
		
	}

}
