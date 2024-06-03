package lesson10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Person> personList = new ArrayList<>();
		
		while (true) {
			System.out.println("1:입력 2:출력 3:삭제 4:종료");
			int num = scan.nextInt();
			
			if (num == 1) {
				System.out.print("이름을 입력하세요:");
				String name = scan.next();
				System.out.print("생년월일을 입력하세요:");
				int birth = scan.nextInt();
				Person person = new Person();
				person.setName(name);
				person.setBirth(birth);
				System.out.println(personList.add(person) ? "입력 성공" : "입력 실패"); 
			} else if (num == 2) {
				if (personList.isEmpty()) {
					System.out.println("비어있습니다.");
					continue;
				}
				System.out.println(personList.toString());
//				Iterator<Person> iter = personList.iterator();
//				while (iter.hasNext()) {
//					Person person = iter.next();
//					System.out.println("이름:" + person.getName() + " 생년월일:" + person.getBirth());
//				}
				
			} else if (num == 3) {
				System.out.print("삭제할 사람 이름을 입력하세요: ");
				String delName = scan.next();
				Iterator<Person> iter = personList.iterator();
				while (iter.hasNext()) {
					Person person = iter.next();
					if (delName.equals(person.getName())) {
						iter.remove();
						System.out.println("삭제 되었습니다.");
					}
				}

			} else if (num == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
