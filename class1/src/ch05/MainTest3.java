package ch05;

import java.util.HashMap;
import java.util.Map;

public class MainTest3 {

	public static void main(String[] args) {
		// Map 자료구조를 이용해서 전화번호를 저장해 주세요 
		// 1 - String, String
		
		// HashMap 생성
		Map<String, String> phoneBook = new HashMap<>(); 
		
		// 전화번호 추가
		phoneBook.put("김미정", "010-3307-2546");
		phoneBook.put("홍길동", "010-1234-5678");
		phoneBook.put("홍길동", "010-1234-5678");
		phoneBook.put("이순신", "010-8765-4321");
		phoneBook.put("홍길동1", "010-1111-2222");
		phoneBook.put("이순신1", "010-2222-3333");
		
		// key 값은 중복될 수 없다.
		System.out.println(phoneBook);
		
		
		//전화 번 호 검색
		String phoneNumber = phoneBook.get("홍길동");
		System.out.println(phoneNumber);
		
		
		// 2 - String, object(Person)

	}

}
