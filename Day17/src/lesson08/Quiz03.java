package lesson08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {
//		1. 체조 경기 평균 점수
//		체조 경기에서 아래와 같은 심사위원 점수가 집계 되었습니다.
//		최고점과 최저점을 제외한 나머지 점수의 평균을 구하세요.
//		for문으로 구현할 것
//		[8, 7, 6, 10, 9, 4]
//		출력 예시
//		최고점과 최저점을 제외한 평균 점수는 7.5
		List<Integer> scores = new ArrayList<>(Arrays.asList(8, 7, 6, 10, 9, 4));
		scores.sort(Comparator.naturalOrder());
		scores.remove(0);
		scores.remove(scores.size()-1);  // 마지막칸

		int sum = 0;
		for (int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
		}
		double average = (double) sum / scores.size();
		System.out.println("최고점과 최저점을 제외한 평균 점수는 " + average);
//		2. 회원 추가하기
//		회원관리 리스트를 만든다.
//		[우솝, 루피, 상디, 나미, 로빈]
//		새로 입력할 이름을 기존 리스트에 추가한다.
//		만약 동명이인이 있을 경우 회원명 뒤에 숫자를 붙인다.
//		(새로 입력할 이름들을 다른 리스트에 넣어두고 시작하기)
//		보람
//		루피
//		쵸파
//		로빈
//		루피
//		출력 예시
//		[우솝, 루피, 상디, 나미, 로빈, 보람, 루피1, 쵸파, 로빈1, 루피2]
		List<String> people = new ArrayList<>(Arrays.asList("우솝", "루피", "상디", "나미", "로빈"));
		List<String> people1 = new ArrayList<>(Arrays.asList("보람", "루피", "쵸파", "로빈", "루피"));
		Iterator<String> iter = people1.iterator();
		while (iter.hasNext()) {
			String name = iter.next();
			if (people.contains(name)) {
				
			} else {
				people.add(name);
			}
		}
		
	}
		
}
