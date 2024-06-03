package lesson10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> fruits = new ArrayList<>();
		
		while (true) {
			System.out.println("1:입력 2:출력 3:삭제 4:종료");
			int num = scan.nextInt();
			
			if (num == 1) {
				System.out.print("과일 이름을 입력하세요: ");
				String fruit = scan.next();  // 단어 입력 받을 때는 scan.next()
//				if (fruits.add(fruit)) {
//					System.out.println("입력 성공");
//				} else {
//					System.out.println("입력 실패");
//				}
				System.out.println(fruits.add(fruit) ? "입력 성공" : "입력 실패"); // 삼항 연산자
			} else if (num == 2) {
				if (fruits.isEmpty()) {
					System.out.println("비어있습니다.");
					continue;
				}
				Iterator<String> iter = fruits.iterator();
				while (iter.hasNext()) {
					System.out.println(iter.next());
				}
				
			} else if (num == 3) {
				System.out.print("삭제할 과일 이름을 입력하세요: ");
				String delFruit = scan.next();
				System.out.println(fruits.remove(delFruit) ? "삭제 성공" : "삭제 실패");

			} else if (num == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
