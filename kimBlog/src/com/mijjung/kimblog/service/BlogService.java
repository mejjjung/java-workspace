package com.mijjung.kimblog.service;

import com.mijjung.kimblog.dao.BlogDAO;

public class BlogService {

	BlogDAO blogDAO;
	
	public BlogService() {
		blogDAO = new BlogDAO();
	}
	
	// 블로그 저장 기능 로직 구현
	public int saveBoard(String title, String content, int userId) {
		int resultRowCount = 0;
		if(title.equals("") || title.length() < 2) {
			return resultRowCount;
		}
		resultRowCount = blogDAO.save(title, content, userId);
		return resultRowCount;
	}
	
	
	
}
