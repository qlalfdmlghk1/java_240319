package lesson09.quiz01;

public class Quiz01 {
	
	// 나의 의식
	public static void main(String[] args) {
        // TODO: stu1 객체 생성 및 값 넣기 구현하기
		Member stu1 = new Member();  // stack 영역에 생성
		stu1.name = "유재석";
		stu1.age = 21;
		stu1.className = "java";
		stu1.phoneNumber = "01023453223";
		
        // 결과값 출력
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println(stu1.className);
        System.out.println(stu1.phoneNumber);
        stu1.isAdult();

        System.out.println();
        
        Member stu2 = new Member();  // stack 영역에 생성
		stu2.name = "이효리";
		stu2.age = 17;
		stu2.className = "java";
		stu2.phoneNumber = "01096482734";

        // 결과값 출력
        System.out.println(stu2.name);
        System.out.println(stu2.age);
        System.out.println(stu2.className);
        System.out.println(stu2.phoneNumber);
        stu2.isAdult();
        
        System.out.println("\n");
        
        Member[] students = new Member[2];
        students[0] = stu1;
        students[1] = stu2;
        
        for (int i = 0; i < students.length; i++) { // 0 ~ 1
        	System.out.println(students[i].name);
        	System.out.println(students[i].age);
        	System.out.println(students[i].className);
        	System.out.println(students[i].phoneNumber);
        	students[i].isAdult();
        	System.out.println();
        }
	}
	}       
//        출력 예시
//        유재석
//        21
//        java
//        01023453223
//        성인입니다.
//
//        이효리
//        17
//        java
//        01096482734
//        미성년자 입니다.

