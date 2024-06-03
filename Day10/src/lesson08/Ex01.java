package lesson08;

public class Ex01 {

	public static void main(String[] args) {
		// String 변수에 값 저장 -> "" 로 만들 것 
		String a = "안녕";
		String b = new String("안녕"); // 객체
		String c = new String("안녕");
		String d = "안녕";
		
		System.out.println(a);
		System.out.println(b);
		
		// String끼리 값 비교
		// == 비교는 stack 영역에 저장된 주소값을 비교하는 것이다.
		System.out.println(a == d); // true
		System.out.println(b == c); // false
		System.out.println(a == b); // false
		
		// String 값 비교시 반드시 .equals() 메소드를 사용
		System.out.println(b.equals(c)); // 값 비교 true
		
	}
}
