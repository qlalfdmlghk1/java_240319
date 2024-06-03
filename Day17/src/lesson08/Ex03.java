package lesson08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(9);
		list.add(1);
		
		// list에 5가 있는가?
		boolean containValue = list.contains(5);
		System.out.println(containValue);
		
		// 오름차순 정렬
		list.sort(Comparator.naturalOrder());  // 정렬 후 저장도 해줌
		System.out.println(list);
		
		// 내림차순 정렬
		list.sort(Comparator.reverseOrder());  // 정렬 후 저장도 해줌
		System.out.println(list);
		
		// 리스트가 비어있는지 확인  []
		System.out.println(list.isEmpty());
		
		list.clear();  // 모두 비우기
		System.out.println(list.isEmpty());
	}

}
