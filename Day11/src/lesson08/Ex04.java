package lesson08;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 문자열 입력
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();	// 단어
		System.out.println(word);
		
		scan.nextLine(); // next()를 할 때 남아있던 문장들을 소비함
		
		String text = scan.nextLine();	// 문장(스페이스바 포함)
		System.out.println(text);
		
	}

}
