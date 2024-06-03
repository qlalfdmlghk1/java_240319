package lesson02.ex01;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("유재석","20000808", "남자");
//		아래와 같이 쓰지 않는다.
//		p1.name = "유재석";
//		p1.birth = "20000808";
//		p1.gender = "남자";
		
		p1.setName("신바다"); // 이름 변경
		p1.setBirth("19951108"); // 생년월일 변경
		p1.setGender("여자"); // 생년월일 변경
		
		p1.greet();
		p1.walk();
		p1.introduce();
		p1.age();
		
		System.out.println(p1.getName());
		System.out.println(p1.getBirth());
		System.out.println(p1.getGender());
	}
}
