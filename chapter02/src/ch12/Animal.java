package ch12;

// 강제성 : 추상 메서드를 포함 하고 있는 클래스는 
// 반드시 추상 클래스가 되어야 한다.
public abstract class Animal {

	// 추상 클래스란? (abstract class)
	// 하나 이상의 추상 메서드를 포함하거나 abstract 키워드를 가진 클래스를 추상 클래스라고 한다.
	
	// 일반 메서드(함수)라고 한다.
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	// 추상메서드라고 한다. { } 중괄호가 없음
	public abstract void hunt();
	
}
