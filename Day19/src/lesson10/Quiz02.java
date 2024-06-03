package lesson10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Quiz02 {

	public static void main(String[] args) {
//		Map에 키에 이름(유재석, 박나래, 이지은, 서장훈, 이광수)을 넣고, 값을 모두 'X'로 초기화 하세요.
//		성씨가 '이'씨인 경우에는 값을 'O'로 바꾼다.
//		Iterator를 사용한다.
//		출력 예시
//		{이지은=O, 서장훈=X, 유재석=X, 이광수=O, 박나래=X}
		
		Map<String,Character> map1 = new HashMap<>();
		map1.put("이지은", 'X'); 		// char은 작은 따옴표
		map1.put("서장훈", 'X');
		map1.put("유재석", 'X');
		map1.put("이광수", 'X');
		map1.put("박나래", 'X');
		
//		Set<String> keys = map1.keySet();
//		Iterator<String> iter = keys.iterator();
		Iterator<String> iter = map1.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			if (key.startsWith("이")) {
				map1.put(key, 'O');
			}
		}
		System.out.println(map1);
	}

}