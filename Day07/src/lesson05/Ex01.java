package lesson05;

public class Ex01 {

	public static void main(String[] args) {
		// method 사용하기
		
		// 반올림
		double d = 3.68;
		long result = Math.round(d);
		System.out.println(result);
		System.out.println(Math.round(d));
		
		// 큰 값
		int max = Math.max(10, 90);
		System.out.println(max);
		System.out.println(Math.max(5.8, 4.1));
		
		// 절대값 구하기
		double abs = Math.abs(-5.5);
		System.out.println(abs);
		
		// input 값 : argument, 인수, 전달인자값, 인자
		// output 값 : 반환값, return, return 값
	}

}
