package lesson01;

public class Quiz02 {

	public static void main(String[] args) {
		// 1. 변수 출력
//		시험 성적이 90점 이상이면 'A'학점이고 평점은 4.0 입니다.
//		시험 성적이 80점 이상이면 'B'학점이고 평점은 3.0 입니다.
		int grade1 = 90;
		int grade2 = 80;
		double score1 = 4.0;
		double score2 = 3.0;
		System.out.println("시험 성적이 " + grade1 + "점 이상이면 'A'학점이고 평점은 " + score1 + " 입니다.");
		System.out.println("시험 성적이 " + grade2 + "점 이상이면 'B'학점이고 평점은 " + score2 + " 입니다.");
		System.out.println();
		
		// 2. 실수 연산
//		두 수의 곱 : 1165.7250000000001
		int number1 = 33;
		double number2 = 35.325;
		double result = number1 * number2;
		System.out.println("두 수의 곱 : " + result);
		System.out.println();
		
		// 3. 날짜 구하기
//		943시간은 39일 7시간 입니다.
		int times = 943;
		int days = times / 24;
		int hours = times % 24;
		System.out.println(times + "시간은 " + days + "일 " + hours + "시간 입니다.");
		System.out.println();
		
		// 4. 도형 넓이 구하기
//		가로 길이 8, 세로 길이 9인 사각형과 삼각형의 넓이를 각각 구하여 출력하세요.
//		넓이는 직접 계산하지 말고, 컴퓨터에게 양보하세요.
//
//		사각형의 넓이: 72
//		삼각형의 넓이: 36
		int width = 8;
		int height = 9;
		int rectangleArea = width * height;
		int triangleArea = rectangleArea / 2;
		System.out.println("사각형의 넓이: " + rectangleArea);
		System.out.println("삼각형의 넓이: " + triangleArea);
		System.out.println();
	}

}
