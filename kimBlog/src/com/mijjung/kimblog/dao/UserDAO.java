package com.mijjung.kimblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mijjung.kimblog.dto.UserDTO;
import com.mijjung.kimblog.utils.DBHelper;

public class UserDAO implements IUserDAO{

	private DBHelper dbHelper;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	@Override
	public int saveUser(UserDTO user) {
		String query = " INSERT INTO user(username,password,email,address,userRole,createDate) "
				+ " VALUES (?,?,?,?,?,now()) ";
		int resultRow = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());
			pstmt.setString(5, user.getUserRole());
			resultRow = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(">>> saveUser 함수에서 오류가 발생 했습니다. <<<");
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public UserDTO selectUserByUsernameAndPassword(String username, String password) {
	
		return null;
	}

}
