package lesson07;

public class Quiz02 {

	public static void main(String[] args) {
		//1. [2][3] => 10
		int[][] arr1 = new int[2][3];
		
		
		// 입력 
		for (int i = 0; i < arr1.length; i++) { // 0 1
			for (int j = 0; j < arr1[i].length; j++) { // 0 1 2
				arr1[i][j] = 10;
			}
		}
		// 출력 
		printArray(arr1);
		
//		2. 순서대로 입력하기
//		[3][4] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같이 각 배열에 1~4를 저장 하고, 출력하세요.
//		출력
//		1 2 3 4 
//		1 2 3 4 
//		1 2 3 4
		int[][] arr2 = new int [3][4];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = j + 1;
			}
		}
		printArray(arr2);
		
//		3. 배열 별로 입력하기
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 첫 번째 행은 1, 두 번째 행은 2, 세 번째 행은 3으로 채우고 출력하세요.
//		출력
//		1 1 1
//		2 2 2 
//		3 3 3 
		int[][] arr3 = new int [3][3];
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = i + 1;
			}
		}
		printArray(arr3);
		
//		4. 십자(+) 그리기
//		[5][5] 크기의 배열을 만드세요.
//		모든 값을 0으로 초기화 하세요.
//		반복문을 이용해서, 아래와 같이 + 위치에 1을 입력 하고 출력하세요.
//		출력
//		0 0 1 0 0 
//		0 0 1 0 0 
//		1 1 1 1 1 
//		0 0 1 0 0 
//		0 0 1 0 0 
		int[][] arr4 = new int[5][5];
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				if (i == 2 || j == 2) {
					arr4[i][j] = 1;
				} // 원래 0으로 채워져 있다.
			}
		}
		printArray(arr4);
		
//		5. 전체 수 입력
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
//		출력
//		1 2 3	i:0		j:0 
//		4 5 6	i:1		j:0
//		7 8 9	i:2		j:0 
		int[][] arr5 = new int[3][3];
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				arr5[i][j] = (i * 3) + (j + 1);
			}
		}
		printArray(arr5);
		
//		6. 전체 수 입력
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
//		출력
//		1 4 7	
//		2 5 8
//		3 6 9
		int[][] arr6 = new int[3][3];
		for (int i = 0; i < arr6.length; i++) {
			for (int j = 0; j < arr6[i].length; j++) {
				arr6[i][j] = (i + 1) + (j * 3);
			}
		}
		printArray(arr6);
	}
	
	
	// 출력 메소드
	// input: 2차원 배열, 	output: X
	public static void printArray(int[][] arr) {
		// 출력 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] +" ");
		}
			System.out.println();
		}
		System.out.println();
	}
}
