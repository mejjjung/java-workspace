package ch07;

public class MainTest1 {

	public static void main(String[] args) {
		Student studentjames = new Student("james", 20_000);
		Student studenttomas = new Student("Tomas", 15_000);
		
		Bus bus100 = new Bus(100);
		Subway subway1 = new Subway(1);
	
		studentjames.takeBus(bus100);
		studentjames.takeBus(bus100);
		studenttomas.takeSubway(subway1);
		studenttomas.takeSubway(subway1);
		
		bus100.showInfo();
		subway1.showInfo();
		studenttomas.showInfo1();
		studentjames.showInfo2();
		
	} // end of main

} // end of class
