package ch12;

public class Person extends Human {

	@Override
	public void hunt() {
		
		super.hunt(); // super => 부모에 있는 메서드를 호출 하라 !!!
		System.out.println("애는 사람이야!");
		// 
	}

	
	
	
}
