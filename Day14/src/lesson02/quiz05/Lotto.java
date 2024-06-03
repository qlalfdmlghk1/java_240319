package lesson02.quiz05;

import java.util.Random;

public class Lotto {
	private int[] lottoNumber = new int[6];
	
	public void setLottoNumber(int a1, int a2, int a3, int a4, int a5, int a6) {
		this.lottoNumber[0] = a1;
		this.lottoNumber[1] = a2;
		this.lottoNumber[2] = a3;
		this.lottoNumber[3] = a4;
		this.lottoNumber[4] = a5;
		this.lottoNumber[5] = a6;
	}
	
	// 수동
	// setter 임
	public void manual(int [] lottoNumber) {
		this.lottoNumber = lottoNumber;
	}
	
	// 자동
	// setter 임
	public void auto() {
		Random rand = new Random();
		for (int i = 0; i < this.lottoNumber.length; i++) {
			int randNum = rand.nextInt(45) + 1; // 1 ~ 45 까지의 수
			this.lottoNumber[i] = randNum;
			for (int j = 0; j < i; j++) { // i보다 하나 전까지 중복 검사
				if (this.lottoNumber[j] == randNum) {
					i--; // i를 다시 채울 수 있게
					break;
				}
			}
		}
	}
	
	// 외부에서 호출할 수 있게 getter
	public int[] getLottoNumber() {
		return this.lottoNumber;
	}
	
	// 번호 6개 출력
	public void printLottoNumber() {
		System.out.print("로또 종이 숫자>> ");
		for (int i = 0; i < this.lottoNumber.length; i++) {
			System.out.print(this.lottoNumber[i] + " ");
		}
		System.out.println();
	}
}
