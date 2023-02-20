package ch05;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		
		// 윤년 계산하기
		// 4의 배수의 해는 윤년
		// 4의 배수이면서 100의 배수인 해는 윤년이아님
		// 100의 배수이면서 400의 배수인 해는 윤년
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도를 입력해주세요");
		int year = sc.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다." );
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
