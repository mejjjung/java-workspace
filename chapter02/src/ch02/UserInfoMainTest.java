package ch02;

public class UserInfoMainTest {

	public static void main(String[] args) {
		// 기본 생성자는 사용자 정의 생성자가 있으면 만들어 주지 않는다.
		
		UserInfo userInfo1 = new UserInfo("mijeong","김미정");
		
		System.out.println(userInfo1.userName);
		System.out.println(userInfo1.userId);
		System.out.println(userInfo1.phone);
		
		
		
		
	} // end of main

} // end of class
