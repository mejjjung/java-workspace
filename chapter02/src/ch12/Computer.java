package ch12;


public abstract class Computer {

	public static void main(String[] args) {
		Computer computer1 = new DeskTop();
		computer1.typing();
		computer1.display();
		 
	}
	
	public abstract void display();
	
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("컴퓨터를 전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("컴퓨터 전원을 끕니다.");
	}
	
	
}
