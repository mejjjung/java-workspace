package com.mijjung.kimblog.controller;

import com.mijjung.kimblog.service.BlogService;

public class BlogController {

	private BlogService blogService;
	
	public BlogController() {
		blogService = new BlogService();
	}
	
	public int reqSaveBpard(String title, String content, int userId) {
		if(userId != 0) {
			return blogService.saveBoard(title, content, userId);
		}
		return 0;
	}
	
	
	
}
