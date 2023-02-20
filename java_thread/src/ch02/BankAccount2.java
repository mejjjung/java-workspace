package ch02;

public class BankAccount2 {
	
	public static void main(String[] args) {
		
		System.out.println("------ main 쓰레드 시작 ------");
		System.out.println(Thread.currentThread());
		System.out.println("------ main 쓰레드 종료 ------");
		Worker worker = new Worker("김미정");
		worker.start();
		
		
	}
	
	
	
}

class Worker extends Thread {
	
	private String name;
	
	public Worker(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println("worker " + name + " : " + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}