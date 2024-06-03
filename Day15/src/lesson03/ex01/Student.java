package lesson03.ex01;

// 자식 클래스
public class Student extends Person {
	private String major;
	
	public Student() {
		System.out.println("학생입니다.");
	}
	
	public Student(String name, String major) {
		super(name); // 부모의 생성자를 호출 - 부모생성자 호출은 첫번째 줄에만 가능
		// 부모클래스의 name 필드에 값 저장
		this.major = major;
		//this.name = name;
		//super.name = name;
	}
	
	// 오버라이드(Override): 부모클래스에 있는 메소드를
	//	자식 클래스에서 재정의 하는 것
	@Override	// annotation: 메타정보
	public void introduce() {
		super.introduce();
		System.out.println("내 전공은 " + this.major + "입니다.");
	}
}
