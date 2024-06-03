package lesson08;

import java.util.ArrayList;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {
		// 3-1)
		List<String> names = new ArrayList<>(List.of("우솝","루피","상디","나미","로빈"));
		List<String> newNames = new ArrayList<>(List.of("보람","루피","쵸파","로빈","루피"));
		
		/*
		for (int i = 0; i < names.size(); i++) { // 0 ~ 4
			int count = 1;
			for (int j = 0; j < newNames.size(); j++) { // 0 ~ 4
				if (names.get(i).equals(newNames.get(j))) {
					newNames.set(j, newNames.get(j) + count++); // 후위 증감연산자이므로 다음줄 부터 적용
				}
			}
		}
		names.addAll(newNames);
		System.out.println(names);*/
		
		// 3-2) 새 이름을 기준으로 돌고, 기준 리스트에 포함되었는지 contains로 확인
		// 		숫자가 붙은 이름도 있는지 확인
		for (int i = 0; i < newNames.size(); i++) { // 0 ~ 4
			int count = 1;
			String newName = newNames.get(i);
			while (names.contains(newName)) {
				newName = newNames.get(i) + count++;  // 루피1
			}
			names.add(newName);
		}
		System.out.println(names);
	}
}
