package ch01;

public class ThreadTest2 {

	// 메인 쓰레드
	public static void main(String[] args) {
		// 2) 사용하는 방법 연습!
		// 현재 쓰레드가 누구야 알아 보는 명령어!
		System.out.println("-------- main 쓰레드 시작 --------");
		System.out.println(Thread.currentThread());
		// 작업자 하나 만들어 내기 (메인 쓰레드가 일 함)
		Worker worker1 = new Worker("워커1");
		// 너가 위임 받은 일을 시작해 --> start()
		worker1.start();
		
		
		// 3) 쓰레드 (작업자) 하나 더 생성해보기
		Worker worker2 = new Worker("워커2");
		worker2.start();
		System.out.println("-------- main 쓰레드 종료 --------");

	} // end of main

} // end of class

// 1) 쓰레드 만들어 보기 (생성) 
// - 상속 활용해서 쓰레드 만들어보기 (작업자 만들어 보기)
// 쓰레드를 상속한 클래스이다. 즉 Worker는 Thread 이기도 하다 - 다형성
