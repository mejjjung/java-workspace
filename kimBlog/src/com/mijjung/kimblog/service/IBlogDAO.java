package com.mijjung.kimblog.service;

public interface IBlogDAO {

	int save(String title, String content, int userId);
	void select();
	void update();
	void delete(int boardId);
	
	
	
}
