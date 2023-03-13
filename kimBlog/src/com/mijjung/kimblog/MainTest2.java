package com.mijjung.kimblog;

import com.mijjung.kimblog.controller.BlogController;
import com.mijjung.kimblog.controller.UserController;
import com.mijjung.kimblog.dto.UserDTO;

public class MainTest2 {

	public static void main(String[] args) {
		
		UserController userController = new UserController();
		
		UserDTO loginUser = userController.requestSingIn("김미정", "2546");
		System.out.println("userId : " + loginUser.getId());
		BlogController blogController = new BlogController();
		
		if(loginUser.getId() != 0) {
			int response = blogController.reqSaveBpard("짱구는 못말려2", "짱구의 일상", loginUser.getId());
			if(response == 0) {
				System.out.println("글쓰기 실패");
			} else {
				System.out.println("글쓰기 성공");
				
			}
		}
	
		
	}

}
