package ch05;

import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {
		
		 Student studentHong = new Student("김미정", 10_000);

	        Bus bus100 = new Bus(100);
	        Bus bus200 = new Bus(200);
	        Bus bus300 = new Bus(300);
	        Subway subwayLine1 = new Subway(1);
	        Subway subwayLine2 = new Subway(2);
	        Subway subwayLine3 = new Subway(3);
	        Scanner scanner = new Scanner(System.in);

	        int busNumber = 0;
	        int subwayNumber = 0;

	        System.out.println("버스를 원하시면 1을, 지하철을 원하시면 2를 입력해주세요");
	        int transport = scanner.nextInt();
	        if (transport == 1) {
	            while (true) {
	                System.out.println("몇번 버스를 타시겠습니까? (0을 입력하면 종료됩니다.)");
	                int busNum = scanner.nextInt();
	                if (busNum == 100) {
	                    studentHong.takeBus(bus100);
	                    studentHong.showInfo();
	                    bus100.showInfo();
	                } else if (busNum == 200) {
	                    studentHong.takeBus(bus200);
	                    studentHong.showInfo();
	                    bus200.showInfo();
	                } else if (busNum == 300) {
	                    studentHong.takeBus(bus300);
	                    studentHong.showInfo();
	                    bus300.showInfo();
	                } else if (busNum == 0) {
	                    break;
	                } else {
	                    System.out.println("해당 버스가 없습니다.");
	                }
	            }

	        }
	        if (transport == 2) {
	            while (true) {
	                System.out.println("몇호선을 타시겠습니까? (0을 입력하면 종료됩니다.)");
	                int subwayNum = scanner.nextInt();
	                if (subwayNum == 1) {
	                    studentHong.takeSubway(subwayLine1);
	                    studentHong.showInfo();
	                    subwayLine1.showInfo();
	                } else if (subwayNum == 2) {
	                    studentHong.takeSubway(subwayLine2);
	                    studentHong.showInfo();
	                    subwayLine1.showInfo();
	                } else if (subwayNum == 3) {
	                    studentHong.takeSubway(subwayLine3);
	                    studentHong.showInfo();
	                    subwayLine1.showInfo();
	                } else if (subwayNum == 0) {
	                    break;
	                } else {
	                    System.out.println("해당 호선이 없습니다.");
	                }
	            }

	        }
	    } // end of main

	}
