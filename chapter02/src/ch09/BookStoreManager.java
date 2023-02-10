package ch09;

import java.util.Scanner;

public class BookStoreManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Book[] books = new Book[100];
		String userInput = null;
		boolean flag = true;
		int index = 0;
		int i = 0;

		while (flag == true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 저장\t2. 전체 조회\t3. 선택 조회\t4. 전체 삭제 \t0. 프로그램 종료");
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("저장하실 책 이름이 무엇인가요?");
				String title = sc.nextLine();
				System.out.println("저장하실 책의 저자를 입력해주세요");
				String author = sc.nextLine();
				books[index] = new Book(title, author);
				index++;
			} else if (userInput.equals("2")) {
				System.out.println("전체 조회");
				for (i = 0; i < books.length; i++) {
					if (books[i] != null) {
						books[i].showInfo();
					}
				}
			} else if (userInput.equals("3")) {
				System.out.println("조회하실 책의 이름을 입력해주세요");
				String title = sc.nextLine();

				boolean isFind = false;
				for (i = 0; i < books.length; i++) {
					if (books[i] != null) {
						if (title.equals(books[i].getTitle())) {
							books[i].showInfo();
							isFind = true;
						}
					}
				}
				if (isFind == false) {
					System.out.println("조회하신 책은 없습니다.");
				}
			} else if (userInput.equals("4")) {
				System.out.println("전체 삭제");
				for(i = 0; i < books.length; i++) {
					books[i] = null;
				}
			} else if (userInput.equals("0")) {
				flag = false;
				System.out.println("프로그램 종료를 선택하셨습니다");
				System.out.println("프로그램이 종료되었습니다!");
			}
		}

		// while 문을 사용해서

		// CRUD에 개념
		// 1. 저장 2. 전체 조회 3. 선택조회 4. 전체 삭제 0. 프로그램 종료
		// 정보를 출력하는 프로그래밍 만들어 주세요.
		// 값을 비교 하는 연산자 ==

	} // end of main

} // end of class
