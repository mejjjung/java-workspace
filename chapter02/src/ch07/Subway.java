package ch07;

public class Subway {

	int subwayLine;
	int passengerCount;
	int money;
	
	public Subway(int subwayLine){
		this.subwayLine = subwayLine;
	}
	
	// 승차
	public void take(int money) {
		this.money +=  money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(" 지하철 호선 : " + this.subwayLine);
		System.out.println("현재 승객은 : " + this.passengerCount);
		System.out.println("수익 : " + this.money);
		System.out.println("-------------------------");
	}

	
}
