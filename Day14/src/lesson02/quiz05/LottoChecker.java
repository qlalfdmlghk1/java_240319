package lesson02.quiz05;

import java.util.Random;

public class LottoChecker {
	private int[] luckyNumber = new int[6];
	
	// checker 객체 생성 시 당첨번호 랜덤으로 생성
	public void LottoChecker() {
		Random rand = new Random();
		for (int i = 0; i < this.luckyNumber.length; i++) {
			int randNum = rand.nextInt(45) + 1; // 1 ~ 45 까지의 수
			this.luckyNumber[i] = randNum;
			for (int j = 0; j < i; j++) { // i보다 하나 전까지 중복 검사
				if (this.luckyNumber[j] == randNum) {
					i--; // i를 다시 채울 수 있게
					break;
				}
			}
		}
	}
	
	// 당첨번호 출력 
	public void printLuckyNumber() {
		System.out.print("당첨 번호 >> ");
		for (int i = 0; i < this.luckyNumber.length; i++) {
			System.out.print(this.luckyNumber[i] + " ");
		}
		System.out.println();
	}
	
	
	// 로또 결과 확인
	// input:Lotto		output:String
	public String check(Lotto lotto) {
		int[] numbers = lotto.getLottoNumber(); // 종이에 적힌 6개 번호
		
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < this.luckyNumber.length; j++) {
				if (numbers[i] == this.luckyNumber[j]) {
					count += 1;
					break; // 같은 숫자가 있으면 가장 가까운 for문 탈출함
				}
			}
		}
		if (count == 6) {
			return "1등";
		} else if (count == 5) {
			return "2등";
		} else if (count == 4) {
			return "3등";
		} else if (count == 3) {
			return "4등";
		} 
		return "꽝"; 
	}
}