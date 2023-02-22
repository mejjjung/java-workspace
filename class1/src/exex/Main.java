package exex;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
	// 학생 생성
	Student student1 = new Student(1, "홍길동", "gildong@naver.com");
	Student student2 = new Student(2, "이순신", "soonsin@naver.com");
	Student student3 = new Student(3, "김미정", "mijeong@naver.com");
	
	// 과정 생성
	Course course1 = new Course(1, "수학", "introduction to Mathmatics");
	Course course2 = new Course(2, "영어", "introduction to English");
	
	Enrollment enrollment1 = new Enrollment(1, student1, course1);
	Enrollment enrollment2 = new Enrollment(2, student2, course1);
	Enrollment enrollment3 = new Enrollment(3, student3, course2);
	

	ArrayList<Enrollment> items = new ArrayList<>();
	items.add(enrollment1);
	items.add(enrollment2);
	items.add(enrollment3);
	
	
	
	
	
	} // end of main
} // end of class 
