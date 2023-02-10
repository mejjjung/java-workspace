package ch06;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die; 
	
	// getter 메서드 직접 만들어 보세요. 5
	public String getname() {
		return this.name;
	}
	
	public int gethp() {
		return this.hp;
	}
	
	public int getpower() {
		return this.power;
	}
	
	public double getdefense() {
		return this.defense;
	}
	
	public boolean isdie() {
		return this.die;
	}
	// setter 메서드 직접 만들어 보세요. 5
	public void setName(String name) {
		if(name == null) {
		System.out.println("이름을 입력하지 않았습니다.");
		}
		this.name = name;
	}
	
	public void setHp(int hp) {
		if(hp <= 0) {
			System.out.println("hp가 떨어졌습니다.");
		}
		this.hp = hp;
	}
	
	public void setPower(int power) {
		if(power <= 10) {
			System.out.println("파워가 모자랍니다.");
		} else if (power == 0) {
			System.out.println("파워가 떨어졌습니다.");
		}
		this.power = power;
	}
	
	public void setDefense(double defense) {
		
		
		
		
		
	}
	
	public void setDie(boolean die) {
		
	}
	
	// 방어적 코드도 추가해 보세요
	
}
