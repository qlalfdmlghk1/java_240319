package lesson06;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		1. 배열 값 변경
//		index와 값을 차례로 입력 받아서, 아래 배열에 해당하는 index에 값을 바꾸고 출력 하세요.
//		int[] numbers = {3, 5, 2, 10, 39};
//		입력 예시
//		변경할 index와 값을 입력하세요 : 2 16
//		출력 예시
//		3 5 16 10 39
		int[] numbers = {3, 5, 2, 10, 39};
//		System.out.print("변경할 index와 값을 입력하세요 : ");
//		int index = scan.nextInt();
//		int num = scan.nextInt();
//		numbers[index] = num;
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
//		System.out.println();
		
//		2. 점수 채점
//		아래와 같이 O 와 X로 채점 결과가 저장된 배열이 있다.
//		100점 만점 기준으로 몇점을 맞았는지 출력하세요.
		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
//		출력 예시
//		60점
//		int score = 0;
//		for (int i = 0; i < scores.length; i++) {
//			if (scores[i] == 'O') {
//				score += 10; 
//			}
//		}
//		System.out.println(score + "점");
		
//		3. 임금 계산
//		아래 배열은 각각 월, 화, 수, 목, 금, 토, 일 7일간의 아르바이트를 한 시간을 나타낸다.
//		시급 기준이 아래와 같을때 7일 동안 일한 총 임금의 값을 출력하세요.
//		평일 시급 : 8500원
//		주말(토,일) 시급 : 9500원
		int[] works = {3, 5, 5, 3, 5, 3, 5};
//		출력 예시
//		일주일간 총 임금은 254500원
		int sum = 0;
		for (int i = 0; i < works.length; i++) {
			if (i >= 5) {
				sum += (works[i] * 9500);
			} else {
				sum += (works[i] * 8500);
			}
		}
		System.out.println("일주일간 총 임금은 " + sum + "원");
		
//		4. 배열 값 변경
//		길이가 5인 int 배열을 만든다.
//		수를 계속 입력 받으면서, 입력 받은 수가 짝수 일때만, 배열에 저장한다.
//		배열이 가득차면 입력을 중단하고, 저장된 수들을 출력한다.
//		입력 예시
//		수를 입력하세요 : 34
//		수를 입력하세요 : 65
//		수를 입력하세요 : 23
//		수를 입력하세요 : 74
//		수를 입력하세요 : 2
//		수를 입력하세요 : 74
//		수를 입력하세요 : 57
//		수를 입력하세요 : 68
//		출력 예시
//		34 74 2 74 68
		int index = 0;
		int [] nums = new int[5];
		while (true) {
			System.out.print("수를 입력하세요 : ");
			int num = scan.nextInt();
			if (num % 2 == 0) {
				nums[index] = num;
				index += 1;
			}
			if (index == 5) {
				for (int i = 0; i < nums.length; i++) {
					System.out.print(nums[i] + " ");
				}
				break;
			}
		}
		
	}

}
