package lesson03.ex01;

public class InheritanceTest {

	public static void main(String[] args) {
//		Person person = new Person("유재석");
//		person.introduce();
		
		// 자식 객체로 생성하면
		// 부모 생성자가 먼저 불려지고, 자식 생성자가 후에 불려진다.
		Student student = new Student("유재석","컴퓨터공학");
		student.introduce();
	}

}
