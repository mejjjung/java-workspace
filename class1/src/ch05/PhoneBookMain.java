package ch05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		// while 0 종료, 1. 저장, 2. 전체조회 3. 선택조회, 4. 선택삭제 5. 전체 삭제
		// tip -> 데이터 입력
		// 샘플 데이터 만들어서 활용
		Scanner scanner = new Scanner(System.in);
		Map<String, String> phoneBook = new HashMap<>(); 

		System.out.println(">> 기능을 선택해주세요 <<");
		String userName;
		String userInput = "-1";
		String userNumber;
		while(!userInput.equals("0")) {
			System.out.println("0 종료, 1. 저장, 2. 전체조회 3. 선택조회, 4. 선택삭제 5. 전체 삭제");
			userInput = scanner.nextLine();
			if(userInput.equals("1")) {
				System.out.println("이름을 입력해 주세요");
				userName = scanner.nextLine();
				System.out.println("전화번호를 입력해 주세요 ex) 010-0000-0000");
				userNumber = scanner.nextLine();
				phoneBook.put(userName, userNumber);
			} else if(userInput.equals("2")) {
				for(String Name : phoneBook.keySet()){
					System.out.println("이름 : " + Name);
					System.out.println("전화번호 : " + phoneBook.get(Name));
				}
			} else if(userInput.equals("3")) {
				System.out.println("조회할 이름을 입력해 주세요");
				userInput = scanner.nextLine();
				System.out.println(phoneBook.get(userInput));
			} else if(userInput.equals("4")) {
				System.out.println("삭제할 이름을 입력해 주세요");
				userInput = scanner.nextLine();
				phoneBook.remove(userInput);
			} else if(userInput.equals("5")) {
				System.out.println("전체삭제하겠습니다.");
				phoneBook.clear();
			}
		}

	}

}
