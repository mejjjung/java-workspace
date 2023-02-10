package ch01;

public class MainTestBus {

	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.number = 100;
		
		bus1.leave();
		bus1.arrive();

		System.out.println("===================");
		
		Subway subway1 = new Subway();
		
		subway1.peopleIn();
		subway1.peopleOut();
		
		
		
	}

}
