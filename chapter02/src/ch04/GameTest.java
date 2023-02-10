package ch04;

public class GameTest {

	// 메인 함수
	public static void main(String[] args) {
		
	Warrior warrior = new Warrior("전사",10,1,1,"총");

		
		warrior.levelup(1);
		warrior.levelup(1);
		
		warrior.powerup(20);
		warrior.powerdown(15);
		
		warrior.attack1(5);
		
		
		warrior.weapon1("총");
		warrior.weapon1("칼");
		warrior.weapon1("망치");
		
		
		warrior.showInfo();
		
	System.out.println("------------------------");
		
		Wizard wizard = new Wizard("마법사", 10, 1, "빗자루");
		
		wizard.levelup(2);	
		wizard.levelup(1);
		
		wizard.powerup(20);
		wizard.powerup(20);
		wizard.powerup(10);
		
	
		
		wizard.powerdown(10);
		wizard.powerdown(40);
		wizard.powerdown(10);
		
		
		wizard.weapon2("화살");
		wizard.weapon2("막대기");
		
		wizard.showInfo();
				
	} // end of main

} // end of class
