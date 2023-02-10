package starcraft3;

/**
 * @author GGG
 */

public class Marine extends Unit {
	

	public Marine(String name) {
		this.name = name;
		this.power = 4;
		this.hp = 70;
	}

	
	
	public void showInfo() {
		System.out.println("====상태창====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}

}
