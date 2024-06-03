package lesson09.quiz01;

// 설계도, 내가 만든 자료형 (붕어빵틀)
public class Member {
	// field
	String name;
	int age;
	String className;
	String phoneNumber;
	
	// method
	void isAdult() {
		if (this.age >= 20) {
			System.out.println(this.name + "는 성인입니다.");
		} else {
			System.out.println(this.name + "는 미성년자 입니다.");
		}
	}

}
