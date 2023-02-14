package ch07;

// 학번과 이름을 정의

// toString
// equals 메서드를 재 정의 해주세요!!!!
// 이름이 같다면 동명이인입니다라고 출력해 주세요~~


public class Student {

	
	private int studentId;
	private String name;
	
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name + "," + this.studentId;
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		Student targetStudent = (Student)obj;
		if(this.name == targetStudent.name && this.studentId == targetStudent.studentId) {
			System.out.println("동명이인 입니다.");
			return true;
		}
		return false;
	}
}
