package lesson03.quiz02;

import lesson03.ex01.Student;

public class HealthTest {
	public static void main(String[] args) {
		// 생성자를 만들지 않으면 파라미터가 없는 기본 생성자가 만들어진다.
		// 파라미터가 있는 생성자를 내가 만들면 기본 생성자가 만들어지지 않는다.
		
		// 상속을 받는 자식 클래스의 객체를 생성할 때
		// 부모 생성자가 먼저 호출된 뒤, 자식 생성자가 호출된다.
		
		// 임의로 부모 생성자를 부르지 않으면
		// 부모의 기본 생성자를 호출하려 시도한다.
		// 그런데 없었기 때문에 에러가 발생했고
		// 3개의 파라미터가 있는 부모 생성자를 호출해야 에러가 나지 않는다.
		HealthRate hr1 = new HealthRate("박둘리",160,45);
		hr1.showInfo();
		
		HealthRate hr2 = new HealthRate("홍길동",168,90);
		hr2.showInfo();
	}

}
