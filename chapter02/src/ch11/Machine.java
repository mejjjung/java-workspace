package ch11;

public class Machine {
	
	
	String productName;
	
	

	public void win() {
		System.out.println("상품을 뽑았습니다.");
	}
	
	public void fail() {
		System.out.println("상품을 뽑지못했습니다.");
	}
	
	
	public void showInfo() {
		System.out.println(productName + "을 뽑으셨군요~!");
	}
	
	
	
}
