package lesson07;

public class Quiz01 {

	public static void main(String[] args) {
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
//		4. 특정 과목 최고점
//		4번째 과목의 최고 성적의 학생이 몇 번째 학생인지와 점수를 출력하세요.
//		출력
//		4번째 과목의 최고 성적자는 2번째 학생이고, 점수는 98
		
		int maxScore = 0;
		int maxI = 0;
		
		for (int i = 0; i <scores.length; i++) { // 0~4
			if (scores[i][3] > maxScore) {
				maxScore = scores[i][3];
				maxI = i + 1;
			}
		}
		System.out.println("4번째 과목의 최고 성적자는 " + maxI + "번째 학생이고, 점수는 " + maxScore);
		
//		5. 일부 평균 최고점
//		시험과목 index 3~7 의 평균이 가장 높은 학생을 구하여 출력하세요.
//		출력
//		3~7 과목 평균이 가장 높은 학생은 3번째 학생이고, 평균은 93.8입니다.
		double maxAverage = 0;
		maxI = 0;
		for (int i = 0; i < scores.length; i++) { // 0 ~ 4
			int sum = 0;
			for (int j = 3; j <= 7; j++) { // 3 ~ 7
				sum += scores[i][j];
			}
			double average = sum / 5.0;
			if (maxAverage < average) {
				maxAverage = average;
				maxI = i + 1;
			}
		}
		System.out.println("3~7 과목 평균이 가장 높은 학생은 " + maxI + "번째 학생이고, 평균은 " + maxAverage + "입니다.");
	}

}
