package com.mijjung.kimblog.controller;

import com.mijjung.kimblog.dto.UserDTO;
import com.mijjung.kimblog.service.UserService;

public class UserController {

	private UserService userService;
	public UserController() {
		userService = new UserService();
	}
	
	
	public String requestSignUp(UserDTO user,String host) {
		String reponse = "외부에서는 회원가입이 안됩니다.";
		if(host.equals("localhost")) {
			reponse = userService.signUp(user);
		}
		return reponse;
	}
	
	public UserDTO requestSingIn(String username, String password) {
		UserDTO responseUserDto = userService.checkUser(username, password);
		return responseUserDto;
	}
	
	
	
}
