package ch03;

public class classMainTest1 {

	// 객체지향 프로그래밍이란 
	// 객체와 객체간에 관계를 형성하고 상호 작용하게 코드를 설계해 나가는 것
	public static void main(String[] args) {
		
		Student studentLee = new Student(1, 3, "이순신");
		Student studentHong = new Student(1, 3, "홍길동");
		
		studentHong.korea.subjectName = "국어";
		studentHong.korea.score = 90;
		studentHong.showInfo();
		
		
		studentLee.korea.subjectName = "국어";
		studentLee.korea.score = 100;
		studentLee.math.subjectName = "수학";
		studentLee.math.score = 5;
		studentLee.showInfo();
		
		
		
		
	}

}
