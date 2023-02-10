package ch04;


// 마법사 클래스 설계 하기
public class Wizard {

	String name; // 이름
	int power;// 파워
	int level;// 레벨
	String weapon;
	
	public Wizard(String name, int power, int level, String weapon) {
		this.name = name;
		this.power = power;
		this.level = level;
		this.weapon = "빗자루";
	}
	
	// 기능
	
	public void levelup(int count) {
		this.level += count;
		System.out.println(count + "레벨이 up 되었습니다.");
	}
	
	public void powerup(int count) {
		this.power += count;
		System.out.println("파워가 " + count + " up 되었습니다.");
		
	}
	
	public void powerdown(int count) {
		this.power -= count;
		System.out.println("공격당하셨습니다. 파워가 " + count + " down 되었습니다.");
		if (power <= 0) {
			System.out.println("파워가 떨어져 사망하셨습니다.");
		}
	}
	
	public void weapon2(String weapon) {
		this.weapon = weapon;
		System.out.println(this.weapon + "을 획득하셨습니다.");
	}
	
	public void showInfo() {
		System.out.println("=========상태창=========");
		System.out.println("이름 : " + name);
		System.out.println("현재 power : "  + power);
		System.out.println("현재 level : " + level);
		System.out.println("현재 무기 : " + weapon);
	}
	
	
	
	
}
