package lesson06.ex01;

public class JobApplicantTest {

	public static void main(String[] args) {
		JobApplicant s1 = new JobApplicant();
		System.out.println(s1.introduce());
		
		Google google = new Google();
		google.recruitJavaDeveloper(s1); // 상위인 Java로 접근하여(up casting 느낌)
	}

}
