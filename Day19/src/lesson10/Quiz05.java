package lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Quiz05 {

	public static void main(String[] args) {
		Map<String, String> myCharacter = new HashMap<>();
        myCharacter.put("닉네임", "마롭");
        myCharacter.put("직업", "마법사");
        myCharacter.put("서버", "B");
        myCharacter.put("레벨", "38");

        // [{닉네임=닉네임1, 직업=전사, 레벨=5}, {닉네임=닉네임1, 직업=전사, 레벨=5}...]
        List<Map<String, String>> characters = new ArrayList<>();
        Map<String, String> character1 = new HashMap<>();
        character1.put("닉네임", "사자고양이");
        character1.put("직업", "전사");
        character1.put("서버", "A");
        character1.put("레벨", "11");
        characters.add(character1);

        Map<String, String> character2 = new HashMap<>();
        character2.put("닉네임", "하구루");
        character2.put("직업", "마법사");
        character2.put("서버", "B");
        character2.put("레벨", "46");
        characters.add(character2);

        Map<String, String> character3 = new HashMap<>();
        character3.put("닉네임", "바다");
        character3.put("직업", "힐러");
        character3.put("서버", "B");
        character3.put("레벨", "23");
        characters.add(character3);

        Map<String, String> character4 = new HashMap<>();
        character4.put("닉네임", "초보");
        character4.put("직업", "힐러");
        character4.put("서버", "A");
        character4.put("레벨", "4");
        characters.add(character4);

        Map<String, String> character5 = new HashMap<>();
        character5.put("닉네임", "토르");
        character5.put("직업", "힐러");
        character5.put("서버", "B");
        character5.put("레벨", "84");
        characters.add(character5);

//      ＊n명의 게임 캐릭터 정보가 주어진다.
//      ＊필요한 파티원 조건:
//      - myCharacter와 같은 서버의 "힐러" 직업을 가진 멤버 후보를 모두 출력한다.
//      보너스 문제: 같은 서버의 힐러 중 레벨이 가장 높은 사람만 출력하세요.
        
        // TODO: 구현
        Map<String,String> maxLevelCharacter = null;
        Iterator<Map<String,String>> iter = characters.iterator();
        while (iter.hasNext()) {
        	Map<String,String> character = iter.next();
        	//System.out.println(character);
        	String server = character.get("서버");
        	String job = character.get("직업");
        	if (myCharacter.get("서버").equals(server) 
        			&& job.equals("힐러")){
        		// 1. 힐러 && 서버 B 모두 출력
        		//System.out.println(character);
        		
        		
        		if (maxLevelCharacter == null) { // 왕의 자리가 비어있을 때(후보가 처음 나타났을 때)
        			maxLevelCharacter = character;
        		} else {
            		// 2-1. 레벨 높은 사람
//        			int maxLevel = Integer.parseInt(maxLevelCharacter.get("레벨"));
//        			int level = Integer.valueOf(character.get("레벨"));
//        			if (maxLevel < level) {
//        				maxLevelCharacter = character;
//        			}
        			
        			// 2-2. 레벨 높은 사람(compareTo)
        			// A.compareTo(B)
        			// A(기준값)가 크면: 1
        			// A(기준값)가 작으면: -1
        			// A와 B가 같으면: 0
        			// 왕.compareTo(후보) => -1이 나올 때 교체
        			if (maxLevelCharacter.get("레벨").compareTo(character.get("레벨")) < 0) {
        				maxLevelCharacter = character;
        			}
        		}
        	}
        }
        System.out.println(maxLevelCharacter);
	}
}