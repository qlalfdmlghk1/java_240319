package lesson06;

public class Quiz01 {

	public static void main(String[] args) {
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
//		1. 배열 값 접근
//		배열의 4번째 값을 6으로 바꾸세요.
		numbers[3] = 6;
		
//		2. 배열 출력
//		배열의 값을 순서대로 출력하세요.
//		출력 예시
//		3 8 9 6 2 1 7 5 
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		3. 배열 역순 출력
//		배열의 값의 반대 순서(역순)로 출력하세요.
//		출력 예시
//		5 7 1 2 6 9 8 3 
		for (int i = numbers.length-1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		4. 배열 출력
//		배열의 짝수번째 위치에 있는 값들을 출력하세요.
//		출력 예시
//		8 6 1 5 
		for (int i = 1; i < numbers.length; i+=2) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
//		5. index
//		배열의 값 중 2가 들어 있는 index를 출력하세요.
//		반복문을 돌면서 2가 있는 값을 찾으세요.
//		출력 예시
//		2가 들어 있는 index는 4
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 2) {
				System.out.println("2가 들어 있는 index는 " + i);
			}
		}
		System.out.println();
		
//		6. 최대값
//		배열의 값 중 가장 큰 값을 출력하세요.
//		출력 예시
//		가장 큰 값은 9
		int max = numbers[0]; 
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("가장 큰 값은 " +max);
		
//		7. 최소값 index
//		배열의 값 중 가장 작은 수가 저장된 index를 출력하세요.
//		출력 예시
//		최소값의 인덱스는 5
		int min = numbers[0]; 
		int minIndex = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
				minIndex = i;
			}
		}
		System.out.println("최소값의 인덱스는 " + minIndex);
		
//		8. 평균
//		배열의 모든 수의 평균을 출력하세요
//		출력 예시
//		평균은 5.125
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}
		avg = sum / numbers.length;
		System.out.println("평균은 " + avg);
		
	}

}
