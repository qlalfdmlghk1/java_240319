package lesson09;

import java.util.HashSet;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {
	    // Q. 1234, 3456 의 합집합, 차집합, 교집합을 구하세요.
//		출력 예시
//		합집합: [1, 2, 3, 4, 5, 6]
//		차집합: [1, 2]
//		교집합: [3, 4]
		
	    // 1234, 3456 값을 세팅한다.
	    Set<Integer> set1 = new HashSet<>();
	    Set<Integer> set2 = new HashSet<>();
	    set1.add(1);
	    set1.add(2);
	    set1.add(3);
	    set1.add(4);
	    set2.add(3);
	    set2.add(4);
	    set2.add(5);
	    set2.add(6);
	    // 아래 객체에 결과를 저장한다.(원본 데이터 set1에 값 변경이 되지 않게 하기 위해)
	    Set<Integer> union = new HashSet<>(); 
	    union.addAll(set1);
	    union.addAll(set2);

	    Set<Integer> difference = new HashSet<>();
	    Set<Integer> difference2 = new HashSet<>();
	    difference.addAll(set1);
	    difference.removeAll(set2);
	    difference2.addAll(set2);
	    difference2.removeAll(set1);
	    
	    Set<Integer> intersection = new HashSet<>();
//	    intersection.retainAll
	    intersection.addAll(union);
	    intersection.removeAll(difference);
	    intersection.removeAll(difference2);
	    
	    // TODO: 구현하기
	    System.out.println("합집합: " + union);
	    System.out.println("차집합: " + difference);
	    System.out.println("교집합: " + intersection);
	}
	

}
