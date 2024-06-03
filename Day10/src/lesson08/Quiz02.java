package lesson08;

public class Quiz02 {

	public static void main(String[] args) {
//		1. 문자열 변환
//		아래 문자열에서 A 를 B로 바꿔서 출력 하세요.
		String gradeStr = "My grade is A";
//		출력 예시
//		My grade is B
		gradeStr = gradeStr.replace("A","B");
		System.out.println(gradeStr);
		
//		2. 문자열 정수 변환
//		아래와 같이 생년월일이 저장된 String 이 있을때 올해 나이를 출력하세요. (한국나이)
		String birth = "19950721";
//		출력 예시
//		OO세
		birth = birth.substring(0,4);
		int year = Integer.valueOf(birth);
		System.out.println(2024-year + "세");
		
//		3. 문자열 검색
//		아래 문자열의 단어 개수를 출력 하세요.(중복 포함)
		String sentence = "To be, or Not to Be. That Is The Question";
//		출력 예시
//		단어 개수 : 10
		String[] words = sentence.split(" ");
		int length = words.length;
		System.out.println("단어 개수 : " + length);
	}

}
