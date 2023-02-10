package ch01;

public class MainTest2 {

	public static void main(String[] args) {
		Student studentMe = new Student();
		
		studentMe.studentName = "김미정 ";
		studentMe.age = 27;
		studentMe.height = 170;
		studentMe.weight = 58;
		System.out.println("나이 : " +  studentMe.age);
		System.out.println("키 : " +  studentMe.height);
		System.out.println("몸무게 : " +  studentMe.weight);
		System.out.println("==========================");
		studentMe.test();
		studentMe.lunch();
		studentMe.home();

	}

}
