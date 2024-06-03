package lesson01.quiz01;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "유재석";
		p1.birth = "20000808";
		p1.gender ="남자";
			
		p1.greet();
		p1.walk();
		p1.introduce();
		p1.age();

	}

}
