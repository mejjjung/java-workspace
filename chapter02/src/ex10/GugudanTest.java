package ex10;

import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int startNum = 0; // 시작 값
		int endNum = 0; // 종료 값
		startNum = sc.nextInt(); 
		endNum = sc.nextInt();
		
		for(int i = startNum; i <= endNum; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i*j );
			}
			System.out.println("");
		}
	
	} // end of main

} // end of class
