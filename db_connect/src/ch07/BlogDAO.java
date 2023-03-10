package ch07;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BlogDAO implements IBlogDAO {
	
	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public BlogDAO() {
		dbHelper = DBHelper.getInstance();
		conn = dbHelper.getConnection();
	}

	@Override
	public ArrayList<BlogDTO> showTitleBlogInfo(String title) {
		
		ArrayList<BlogDTO> list = new ArrayList<>();
		
		String sql = " SELECT u.user_name, b.post_subject,b.update_date,r.reply,r.create_reply "
				+ " FROM user AS u\r\n"
				+ " INNER JOIN blog AS b "
				+ " ON u.user_id = b.user_id "
				+ " INNER JOIN reply AS r "
				+ " ON b.blog_id = r.blog_id "
				+ " WHERE u.user_name = ?  ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();
			
//			while(rs.next()) {
//				BlogDTO dto = new BlogDTO();
//				dto.setUserName(rs.getString("user_name"));
//				dto.setPostSubject(rs.getString("post_subject"));
//				dto.setUpdateDate(rs.getString("update_date"));
//				dto.setReply(rs.getString("reply"));
//				dto.setCreateReply(rs.getString("create_reply"));
//				list.add(dto);
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return list;
	}

	@Override
	public int insert(BlogDTO dto) {
		String sqlFormat = " INSERT INTO user(user_id, user_name) "
				+ " VALUES (%d, '%s')  ";
		
		String sql = String.format(sqlFormat, dto.getUserName(),dto.getUser_id());
		Connection conn = dbHelper.getConnection();
		int resultRowCount = 0;
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.err.println("틀린게 없는지 확인하세요");
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultRowCount;
	}



}
