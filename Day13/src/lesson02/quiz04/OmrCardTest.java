package lesson02.quiz04;

public class OmrCardTest {
	
	// 나의 의식
	public static void main(String[] args) {
		OmrCard card = new OmrCard();
		// 비어있는 Omr card를 받는다.
		
		// 이름, 학번, 정답 마킹
		card.setName("유재석");
		card.setStudentId(20200101);
		// card.setAnswer(2, 4, 5, 3, 1);
		card.setAnswer(new int[] {1, 4, 5, 3, 2});
		
		// 리더기에 카드를 넣고 점수를 확인
		OmrCardReader reader = new OmrCardReader(2, 4, 5, 3, 3);
		
		// 결과 출력 => reader가 수행할 것임
		reader.printScore(card);
	}

}
