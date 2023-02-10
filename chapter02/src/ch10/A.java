package ch10;

// 하나의 자바 파일 안에 class는 여러개 존재 가능
// 하지만 publc은 하나만 존재 할 수 있다
public class A {
	String name;
	int height;
	int weight;
	int age;
	
	// 코드 테스트
	public static void main(String[] args) {
		
		C myC = new C();
		myC.age = 100;
		System.out.println(myC.age);
		
	}
} // end of A class

class B {
	String name;
	int height;
	int weight;
	int age;
	
	int level;
	String nicname;
	
} // end of B class

class C extends A {

	String phone;
	
} // end of C