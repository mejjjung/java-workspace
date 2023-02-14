package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		Television television = new Television();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot robot = new ToyRobot();
		ToyCar toyCar = new ToyCar();

		RemoteController cotroller1 = television;
		RemoteController cotroller2 = refrigerator;
		RemoteController cotroller3 = robot;
		RemoteController cotroller4 = toyCar;

		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = television;
		remoteControllers[1] = refrigerator;
		remoteControllers[2] = robot;
		remoteControllers[3] = toyCar;
		
		SoundEffect[] soundEffects = new SoundEffect[2];
		soundEffects[0] = refrigerator;
		soundEffects[1] = robot;

		// 문제 - 1;
		// for문을 활용해서 전원을 전부 켜주세요
			for(int i = 0; i < remoteControllers.length; i++) {
				remoteControllers[i].turnOn(); // 컴파일 시점, (turnOn, turnOff)
				
			}
		// 문제 - 2
		// index 값이 3번째 녀석이면 자기자신의 타입이 무엇인지 확인하는 코드 짜기
			for(int i = 0; i < remoteControllers.length; i++) {
				if(i == 3) {
					System.out.println("3번째 녀석은 ToyCar 데이터 타입 입니다.");
				}
			}
			
		// 문제 - 3
			// 만약 데이터 toyRobot 이면 멤버 변수 name 값을 출력해 주세요
			for(int i = 0; i < remoteControllers.length; i++) {
				if(remoteControllers[i] instanceof ToyRobot) {
					// 업캐스팅 된 상태 이기 때문에
					// 자식 타입으로 바라보기 위해서는 다운 캐스팅 개념을 알고 있어야 한다.
			
				}
			}
			
		// 문제 - 4
		// 장난감 로봇에 소리 기능을 추가해 달라는 요청!
		// 냉장고에도 소리 나는 기능을 추가해 달라고 요청!
		// 소리기능 --> 인터페이스로 설계
		// 냉장고 --> 띠리리링 ~~~
		// 장난감 --> 두두두 뚜두 ~~ 새삥 ~
		for(int i = 0; i <soundEffects.length; i++) {
			soundEffects[i].soundOn();
		}
			
	} // end of main

} // end of class
