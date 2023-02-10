package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		// 객체 생성
		Student studentHong = new Student("홍길동", 10_000);

		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus1001 = new Bus(1001);
		Subway subwayLine1 = new Subway(1);
		Subway subwayLine2 = new Subway(2);
		Subway subwayLine3 = new Subway(3);

		Scanner scanner = new Scanner(System.in);

		int subwayLine = 0;
		int busNumber = 0;
		while (busNumber != 100 || busNumber != 200 || busNumber != 1001) {
			System.out.println("버스를 타시겠습니까 지하철을 타시겠습니까?");			
			busNumber = scanner.nextInt();
			if (busNumber == 100) {
				studentHong.takeBus(bus100);
				studentHong.showInfo();
				bus100.showInfo();

			} else if (busNumber == 200) {
				studentHong.takeBus(bus200);
				studentHong.showInfo();
				bus200.showInfo();
			} else if (subwayLine == 1) {
				studentHong.takeSubway(subwayLine1);
				studentHong.showInfo();
				subwayLine1.showInfo();

			} else if (subwayLine == 2) {
				studentHong.takeSubway(subwayLine2);
				studentHong.showInfo();
				subwayLine2.showInfo();

			} else if (subwayLine == 3) {
				studentHong.takeSubway(subwayLine3);
				studentHong.showInfo();
				subwayLine3.showInfo();
			}
		}

	} // end of main

} // end of class
