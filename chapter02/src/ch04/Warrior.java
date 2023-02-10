package ch04;


// 전사 클래스 설계 하기
public class Warrior {

	// 상태
	String name; // 이름
	int power;// 파워
	int level;// 레벨
	String weapon;// 무기
	int attack;
	

	public Warrior(String name, int power, int level,int attack, String weapon) {
		this.name = name;
		this.power = 10;
		this.attack = 1;
		this.level = 1;
		
		this.weapon = "총";
	}
	
	
	// 기능
	
	
	public void levelup(int count) {
		this.level += count;
		System.out.println(count + " 레벨이 up 되었습니다.");
	}
	
	public void attack1(int count) {
		this.attack += count;
		System.out.println("필살기를 사용했습니다.");
		for(int i = 1;  i <= count; i++) {
			System.out.println("attack!!!!" + i);
		}
		System.out.println("적을 " + count + "번 공격하였습니다.");
	}
	
	
	public void powerup(int count) {
		this.power += count;
		System.out.println("파워가 " + count + " up 되었습니다.");
	}
	
	public void powerdown(int count) {
		this.power -= count;
		System.out.println( "공격 당하셨습니다. 파워가 " + count + " down 되었습니다.");
		if (power <= 0) {
			System.out.println("파워가 떨어져 사망하셨습니다.");
		}
	}
	
	public void weapon1(String weapon) {
		this.weapon = weapon;
		System.out.println(this.weapon + "을 획득하셨습니다.");
	}
	
	
	public void showInfo() {
		System.out.println("=========상태창=========");
		System.out.println("이름 : " + name);
		System.out.println("현재 power : "  + power);
		System.out.println("공격 횟수 : " + attack);
		System.out.println("현재 level : " + level);
		System.out.println("현재 무기 : " + this.weapon);
	}
	
	
} // end of class
