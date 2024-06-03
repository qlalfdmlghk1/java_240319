package lesson01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1. 몫과 나머지
//		두 수를 입력 받아서 몫과 나머지를 출력하세요.	
//		몫 : 105 나머지 : 3
		
//		System.out.print("입력1:");
//		int num1 = scan.nextInt();
//		System.out.print("입력2:");
//		int num2 = scan.nextInt();
//		int di = num1 / num2;
//		int mod = num1 % num2;
//		System.out.println("몫 : " + di + " 나머지 : " + mod);
		
//		2. 교체(swap) 알고리즘
//		수 두개를 x, y 에 입력 받아서 바꿔서 출력하세요.
//		x는 4이고, y는 6 입니다.
		
//		System.out.print("x:");
//		int x = scan.nextInt();
//		System.out.print("y:");
//		int y = scan.nextInt();
//		int temp = y;
//		y = x;
//		x = temp;
//		System.out.println("x는 " + x + "이고, y는 " + y + " 입니다.");
		
//		3. 초 변환
//		초를 입력 받아서 ?분?초 형태로 출력 하세요.
//		
//		입력 예시
//		초 : 464
//		
//		출력 예시
////		7분 44초
//		System.out.print("초 : ");
//		int second = scan.nextInt();
//		int min = second / 60;
//		second = second % 60;
//		System.out.println(min + "분 " + second + "초");
		
//		4. 자리수 쪼개기
//		네 자리수 숫자를 입력 받아서 천의 자리부터 한줄씩 출력 하세요.
//		입력 예시
//		입력 : 1234
//		
//		출력 예시
//		1
//		2
//		3
//		4
//		System.out.print("입력 : ");
//		int num = scan.nextInt();
//		int result = num / 1000;
//		System.out.println(result);
//		num -= result * 1000;
//		result = num / 100;
//		System.out.println(result);
//		num -= result * 100;
//		result = num / 10;
//		System.out.println(result);
//		num -= result * 10;
//		System.out.println(num);
		
//		5. 자리수 합 구하기
//		네 자리수를 입력 받아서 각 자리수의 합을 출력하세요.
//		입력 예시
//		입력 : 1234
		
//		출력 예시
//		합계는 10 입니다.
		System.out.print("입력 : ");
		int num = scan.nextInt();
		int sum = num % 10;
		num /= 10;
		sum += num % 10;
		num /= 10;
		sum += num % 10;
		num /= 10;
		sum += num % 10;
		num /= 10;
		
		System.out.println(sum);
		
	}

}
