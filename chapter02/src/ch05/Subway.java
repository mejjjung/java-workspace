package ch05;

import java.util.Scanner;
public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	// 생성자 - 리턴타입 업고, 클래스 이름과 같다
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 호선 : " + this.lineNumber);
		System.out.println("승객수: " + this.passengerCount);
		System.out.println("수익 금액: " + this.money);
		System.out.println("-----------------------");
	}
	
}
