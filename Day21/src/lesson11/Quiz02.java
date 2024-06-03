package lesson11;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 스톱와치 기능을 계속 사용하기 위해 무한루프
		StopWatch watch = null;
		while (true) {
			System.out.println("시작을 쓰면 스톱워치가 수행되고, 그만을 쓰면 스톱워치가 중단됩니다.");
			String command = scan.next();
			if (command.equals("시작")) {
				watch = new StopWatch();
				watch.start();
			} else if (command.equals("그만")) {
				watch.setStop(true);
				System.out.println("걸린 시간:" + watch.getSeconds() + "초");
			}
		}

	}

}
