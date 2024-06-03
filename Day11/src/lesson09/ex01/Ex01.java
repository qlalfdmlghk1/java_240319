package lesson09.ex01;

public class Ex01 {

	// 나의 의식
	public static void main(String[] args) {
		int a = 10;
		
		// 객체(Object)로 만든다.
		// ScoreData의 instance다.
		ScoreData sd = new ScoreData(); // new 옆은 heap 영역에 쌓인다.
		sd.subject = "국어";
		sd.score = 95;
		sd.rank = 2;
		
		// 필드 값 출력하기
		System.out.println(sd.subject);
		System.out.println(sd.score);
		System.out.println(sd.rank);
		
		sd.printInfo();
	}

}
