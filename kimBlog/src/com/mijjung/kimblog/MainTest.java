package com.mijjung.kimblog;

import com.mijjung.kimblog.controller.UserController;
import com.mijjung.kimblog.dto.UserDTO;

public class MainTest {

	public static void main(String[] args) {
		
		UserDTO userDTO = new UserDTO("흰둥이","0526","white@nate.com","서울");
		UserController userController = new UserController();
		
		
		String result = userController.requestSignUp(userDTO, "localhost");
		System.out.println(result);

	}

}
