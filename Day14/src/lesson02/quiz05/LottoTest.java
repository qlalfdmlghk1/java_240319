package lesson02.quiz05;

public class LottoTest {

	public static void main(String[] args) {
		// 나의 의식
		
		// 로또 수동으로 주세요!
		Lotto lotto1= new Lotto(); 		// 아무것도 없는 비어있는 종이
		lotto1.manual(new int[] {6,10,21,23,29,44});

		// 번호 출력(로또)
		lotto1.printLottoNumber();
		
		
		// 로또 자동으로 주세요!
		Lotto lotto2 = new Lotto();
		lotto2.auto();
		
		
		// 번호 출력(로또)
		lotto2.printLottoNumber();
	    
		// 로또 체커로  확인 => 1번만 생성
		// -- 당첨번호는 생성자에서 세팅
		// -- 당첨번호 출력
		LottoChecker lottoChecker = new LottoChecker();
		lottoChecker.printLuckyNumber();
		
		// 로또 결과
		String result1 = lottoChecker.check(lotto1);
		String result2 = lottoChecker.check(lotto2);
		
	}

}
