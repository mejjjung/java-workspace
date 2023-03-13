package com.mijjung.kimblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mijjung.kimblog.service.IBlogDAO;
import com.mijjung.kimblog.utils.DBHelper;

public class BlogDAO implements IBlogDAO {
	
	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public BlogDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	

	@Override
	public int save(String title, String content, int userId) {
		
		int resultRowCount = 0;
		String query = " INSERT INTO board (title, content, userId) "
				+ " VALUES (?,?,?) ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(3, userId);
			resultRowCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(" >> blogDao save에서 에러 발생 <<");
			e.printStackTrace();
		}
		return resultRowCount;
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int boardId) {
		// TODO Auto-generated method stub
		
	}

}
