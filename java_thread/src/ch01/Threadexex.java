package ch01;

public class Threadexex {

	public static void main(String[] args) {

		System.out.println("--------메인 쓰레드 시작 --------");
		System.out.println(Thread.currentThread());

		Worker1 worker = new Worker1("김미정");
		worker.start();
		Worker2 worker1 = new Worker2("성호석");
		worker1.start();
		System.out.println("--------메인 쓰레드 종료 --------");

	}

}

class Worker1 extends Thread {

	private String name;

	public Worker1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 28; i++) {
			System.out.println(name + "의 나이는 " + i);
			if (i == 27) {
				System.out.println("현재" + name + "의 나이는 " + i + "입니다");
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Worker2 extends Thread {
	private String name;

	public Worker2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int j = 0; j < 32; j++) {
			System.out.println(name + "의 나이는 " + j);
			if (j == 31) {
				System.out.println("현재" + name + "의 나이는 " + j + "입니다");
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
