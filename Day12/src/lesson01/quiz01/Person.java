package lesson01.quiz01;

public class Person {
//	1. Person 클래스 만들기
//	Person 클래스를 만드세요.
//	멤버변수명(필드)과 메소드명은 영문 소문자로 지으세요.
//	필드
//	이름(String)
//	생년월일(String) - 'yyyymmdd' 형식
//	성별(String)
//	메소드
//	인사하기: 인사말을 출력한다.
//	걷기: 걷는다고 출력한다.
//	자기소개 하기: "내 이름은 OOO이고 성별은 OO이다." 라고 출력한다.
//	나이 알려주기: 생년월일을 이용해서 나이를 계산하여 "나이는 OO세이다."라고 출력한다.
//	객체 생성 후 메소드들을 모두 호출하세요.
//	객체 생성 및 호출 예시(메소드명은 각자 지을 것)

	// TODO 객체 생성 및 값 넣기
	String name;
	String birth;
	String gender;
	
	// 메소드 호출
//	객체명.인사하기();
//	객체명.걷기();
//	객체명.소개하기();
//	객체명.나이알려주기();
	void greet() {
		System.out.println("안녕하세요.");
	}
	void walk() {
		System.out.println("걷고 있습니다.");
	}
	void introduce() {
		System.out.println("내 이름은 " + this.name + "이고 성별은 " + this.gender + "이다.");
	}
	void age() {
		int year = Integer.parseInt(birth.substring(0, 4));
		int age = 2024 - year;
		System.out.println("나이는 " + age + "세 이다.");
	}
}
