package lesson08;

public class Ex03 {

	public static void main(String[] args) {
		String s1 = "eclipse";
		
		// charAt: n번째 index에 무슨 문자(char)가 있는지 확인
		System.out.println("charAr:" + s1.charAt(4));
		
		// contains: 특정 문자열이 문자열 안에 포함됐는지 확인
		System.out.println("contains:" + s1.contains("lip"));
		
		// startsWith: 특정 문자열로 시작하는지 확인
		System.out.println("startsWith:" + s1.startsWith("a"));
		
		// endsWith: 특정 문자열로 시작하는지 확인
		System.out.println("endsWith:" + s1.endsWith("aa"));
		
		// length: 알파벳의 개수
		System.out.println("length:" + s1.length());
		
		// replace: 포함된 문자열 부분을 교체(치환)
		String s2 = "지금 먹고 싶은 음식은 치킨이다.";
		s2 = s2.replace("치킨", "족발"); // String 타입이라 직접 원래 문자열에 저장해야 한다.
		System.out.println("replace:" + s2);
		
		// split: 특정 구분자를 기준으로 잘라서 배열에 넣는다.
		String s3 = "apple,melon,grape";
		String[] fruits = s3.split(",");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		// substring: 문자열 추출
		String s4 = "javastudy";
		
		//study 추출
		System.out.println("substring:" + s4.substring(4)); // index 4 이후 모두
		
		//java 추출
		System.out.println("substring param2:" + s4.substring(0,4));
		
		//study 추출
		System.out.println("substring param2:" + s4.substring(4,9)); // index 4 이후 모두
				
	}
	
}
