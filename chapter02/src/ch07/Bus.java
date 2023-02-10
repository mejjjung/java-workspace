package ch07;

public class Bus {

	int busNumber; // 버스 번호
	int passengerCount; // 승객 수
	int money; // 요금
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 승차
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스 번호 : " + this.busNumber);
		System.out.println("현재 승객은 : " + this.passengerCount);
		System.out.println("수익 : " + this.money);
		System.out.println("-------------------------");
	}

}
