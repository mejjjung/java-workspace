package ch02;

import java.util.Scanner;

public class HumanMainTest2 {

	public static void main(String[] args) {

		Human human = new Human();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력해주세요");
		human.name = sc.nextLine();

		System.out.println("키를 입력해주세요");
		human.height = sc.nextInt();
		
		System.out.println("몸무게를 입력해주세요");
		human.weight = sc.nextInt();
		
		System.out.println("남자인가요?");
		human.isMan = sc.nextBoolean();
		
		
		
		System.out.println("이름:  " + human.name);
		System.out.println("키:  " + human.height);
		System.out.println("몸무게:  " + human.weight);
		System.out.println("성별:  " + human.isMan);
		
		
		
		human.showInfo();
		
		 
		 
		// 스캐너를 활용해서 값을 할당해 주세요.
		
		 // 심화문제 
		// 스캐너를 통해서 showInfo 메서드 호출 기능 만들어 보기
		// 마지막에는 showInfo 메서드 호출해서 값을 확인해 주세요.
		
		

	} // end of main

} // end of class
