package lesson08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Quiz02 {

	public static void main(String[] args) {
//		1. List 만들기
//		리스트에 주어진 값들을 넣으세요.
//		20 3 5 84 17
		List<Integer> lists = new ArrayList<>(List.of(20, 3, 5, 84, 17));
		
//		2. 최소값 구하기
//		List에서 가장 작은 값을 출력하세요.
//		for문을 사용하세요.(향상된 for문 X)
//		출력 예시
//		3
		int minValue = lists.get(0);
		for (int i = 0; i < lists.size(); i++) {
			int num = lists.get(i);
			if (num < minValue) {
				minValue = num;
			}
		}
		System.out.println(minValue);
		
//		3. 합계 구하기
//		List 요소들의 총 합계를 구하세요.
//		Iterator를 사용하세요.
//		출력 예시
//		129
		Iterator<Integer> iter = lists.iterator();
		int sum = 0;
		while (iter.hasNext()) {
			int num = iter.next();
			sum += num;
		}
		System.out.println(sum);
	}

}
