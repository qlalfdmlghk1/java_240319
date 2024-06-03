package lesson02.quiz04;

public class OmrCardReader {
	// 필드
	private int[] correctAnswer = new int[5];
	
	// 메소드
	// 생성자 - 정답 세팅 => 확장성 위해
	public OmrCardReader(int a1, int a2, int a3, int a4, int a5) {
		this.correctAnswer[0] = a1;
		this.correctAnswer[1] = a2;
		this.correctAnswer[2] = a3;
		this.correctAnswer[3] = a4;
		this.correctAnswer[4] = a5;
	}
	
	// OmrCard에 적힌 이름, 학번, 점수 출력
	public void printScore(OmrCard omrCard) {
		System.out.println("이름:" + omrCard.getName());
		System.out.println("학번:" + omrCard.getStudentId());
		
		// 점수 구하기
		int score = 0;
		for (int i = 0; i < this.correctAnswer.length; i++) { // 0 ~ 4
			if (this.correctAnswer[i] == omrCard.getAnswer()[i]) {
				score += 100 / this.correctAnswer.length;
			}
		}
		System.out.println("점수:" + score);
	}
}
