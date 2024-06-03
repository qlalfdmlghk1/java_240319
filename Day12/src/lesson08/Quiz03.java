package lesson08;

public class Quiz03 {

	public static void main(String[] args) {

		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
		String[] names = memberStr.split(":");
		int resultCount = 0;
		
		// 3-2) 마킹 X
		for (int i = 0; i < names.length - 1; i++) {
			int sameCount = 0;
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					sameCount += 1;
				}
			}
			// 맨 뒤에 발견된 동명이인만 종류수에 카운팅한다.
			if (sameCount == 1) {
				resultCount += 1;
			}
		}
		
		// 3-1) 마킹		
//		for (int i = 0; i < names.length - 1; i++) {
//			String name = names[i]; // 검사할 기준 이름
//			boolean flag = false; 
//			
//			// 동명이인으로 체크돼서 -로 되어있는 경우 skip(continue)
//			if (name.equals("-")) {
//				continue;
//			}
//			
//			for (int j = i + 1; j < names.length; j++) {
//				if (name.equals(names[j])) {
//					flag = true;
//					names[j] = "-";
//				}
//			}
//			if (flag) {
//				resultCount += 1;
//			}
//		}
		System.out.println("동명이인 종류 수:" + resultCount);
	}
}