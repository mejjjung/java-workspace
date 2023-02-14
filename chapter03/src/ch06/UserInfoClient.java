package ch06;

import java.util.Scanner;

public class UserInfoClient {
	
	static String dbName = "Oracle";

	// main -->  실행하는 코드 작성 (사용 쪽 코드)
	public static void main(String[] args) {
		
		
		
		
		// 사용자 한테 정보를 입력 받는다 !!!
		// String userName, String pw
		// 스캐너 활용 --> 이름 한글자 이상 , pw 특수 포함
		String inputUserName = "홍길동";
		String inputUserPw = "1234";
		// 위에 받은 데이터를 Object 타입 변화 --> DTO
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
				Scanner sc = new Scanner(System.in);
					
		
					
					System.out.println("이름을 입력하세요");
					String userInput = sc.nextLine();
					
					
					
					
		IUserInfoDao dao;
		if(UserInfoClient.dbName.equals("Oracle")) {
			dao = new UserInfoMysqlDao();
		} else {
			dao = new UserInfoMsSqlDao();
		}
		
		
		
		
		
		
	}

}
