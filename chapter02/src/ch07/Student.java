package ch07;

public class Student {

	
	String studentname;
	int grade;
	int money;
	
	public Student(String studentname, int money) {
		this.studentname = studentname;
		this.money = money;
	}
	
	// 버스를 타다.
	public void takeBus(Bus bus) {
		bus.take(1_000);
		this.money -= 1_000;
	}
	
	// 지하철을 타다.
	public void takeSubway(Subway subway) {
		subway.take(1_200);
		this.money -= 1_200;
	}
	

	
	public void showInfo1() {
		System.out.println("========상태창============");
		System.out.println("학생이름 : " + this.studentname);
		System.out.println("잔돈 : " + this.money );
	}
	
	public void showInfo2() {
		System.out.println("========상태창============");
		System.out.println("학생이름 : " + this.studentname);
		System.out.println("잔돈 : " + this.money );
	}
	
	
} // end of class
