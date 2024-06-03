package lesson08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		
		// 1. index 기반
//		for (int i = 0; i < fruits.size(); i++) {
//			System.out.println(fruits.get(i));
//			
//			String fruit = fruits.get(i);
//			if (fruit.startsWith("b")) {
//				fruits.remove(i);
//				i--; // 삭제된 후 한번 더 돌리기 위해(size 변경 방지)
//			}
//		}
		
		// 2. Iterator 사용
//		Iterator<String> iter = fruits.iterator(); // java.util로 해야 함.
//		while (iter.hasNext()) {
//			String fruit = iter.next();  // next() 할 때마다 소비가 되므로 반복문에서 한번만 수행
//			System.out.println(fruit);
//			
//			if (fruit.startsWith("b")) {
//				// fruits.remove(fruit);  이터레이터를 사용하 때는 리스트에서 직접 삭제하지 않는다.
//				iter.remove();
//			}
//		}
		
		// 3. 향상된 for문 	=> 가장 쉬움
		// money in pocket
		// list를 중간에 변경시키면 안된다.
		for (String fruit : fruits) { // apple banana cherry
			System.out.println(fruit);
			
			if (fruit.startsWith("b")) {
				fruits.remove(fruit);
			}
		}
		System.out.println(fruits);
	}

}

