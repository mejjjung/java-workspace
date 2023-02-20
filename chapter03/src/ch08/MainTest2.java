package ch08;

import java.io.FileInputStream;

public class MainTest2 {

	public static void main(String[] args) {
		
		// 예외 처리 구문 작성
		// 10 / 0 연산 시키고 예외 처리 까지 작성해 주세요
		
		int num1 = 10;
		int num2 = 0;
		
		try {
			int result = num1 / num2;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없는데용");
		}
		System.out.println("다른 숫자를 넣으세용");
		
		
	}

}
