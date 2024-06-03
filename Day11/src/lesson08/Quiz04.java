package lesson08;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
//		1. 문자열 검색
//		파일이름이 저장된 문자열 배열에서 jpg 파일이 몇개인지 출력하세요.
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//		출력 예시
//		jpg 파일 개수 : 3
		int cnt1 = 0;
		int cnt2 = 0;
		for (int i = 0; i < files.length; i++) {
			if (files[i].contains(".jpg")) {
				cnt1 += 1;
			}
			if (files[i].endsWith(".jpg")) {
				cnt2 += 1;
			}
		}
		System.out.println("jpg 파일 개수 : " + cnt1);
		System.out.println("jpg 파일 개수 : " + cnt2);
		System.out.println();
		
//		2. 영 단어 퀴즈
//		영어 단어 퀴즈를 낸다.
//		아래와 같이 4개의 문제를 출제하고, 문자열로 차례차례 입력을 받는다.
//		100점 만점 기준으로 몇점인지 출력한다.
//		1. 승리을 영어로 입력하세요 :
//		2. 사랑을 영어로 입력 하세요 :
//		3. 컴퓨터를 영어로 입력 하세요 :
//		4. 노트북을 영어로 입력하세요 :
//		입력 예시
//		1. 승리을 영어로 입력하세요 :victory
//		2. 사랑을 영어로 입력 하세요 :lobe
//		3. 컴퓨터를 영어로 입력 하세요 :computer
//		4. 노트북을 영어로 입력하세요 :notebook
//		출력 예시
//		점수는 75점 입니다.
		Scanner scan = new Scanner(System.in);
		String [] quizWord = {"승리", "사랑", "컴퓨터", "노트북"};
		String [] answerWord = {"victory", "love", "computer", "notebook"};
		
		int score = 0;
		for (int i = 0; i < quizWord.length; i++) { // 0 ~ 3
			System.out.print((i + 1) + ". " + quizWord[i] + "을(를) 영어로 입력하세요:");
			String answer = scan.next();
			if (answer.equals(answerWord[i])) {
				score += 25;
			}
		}
		System.out.println("점수는 " + score + "점 입니다.");
//		System.out.print("승리을 영어로 입력하세요 :");
//		String answer1 = scan.next();
//		System.out.print("사랑을 영어로 입력하세요 :");
//		String answer2 = scan.next();
//		System.out.print("컴퓨터를 영어로 입력하세요 :");
//		String answer3 = scan.next();
//		System.out.print("노트북을 영어로 입력하세요 :");
//		String answer4 = scan.next();
//		if (answer1.equals("victory")) {
//			score += 25;
//		}
//		if (answer2.equals("love")) {
//			score += 25;
//		}
//		if (answer3.equals("computer")) {
//			score += 25;
//		}
//		if (answer4.equals("notebook")) {
//			score += 25;
//		}
//		System.out.println("점수는 " + score + "점 입니다.");
		
//		3. 동명이인 수 구하기
		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
//		동명이인 종류: 송강호, 이민정, 이정재 => 3
//		출력 예시
//		동명이인 종류 수:3
//		String[] names = memberStr.split(":");
//		for (int i = 0; i < names.length; i++) {
//			if (names[i] == )
//		}
//		System.out.println(names);
	}
	
	
}
