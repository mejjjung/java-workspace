package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BuyDAO implements IBuyDAO {

	private DBClient dbClient;
	
	public BuyDAO() {
		initData();
	}
	
	private void initData() {
		dbClient = new DBClient();
	}
	
	
	@Override
	public ArrayList<BuyDTO> select() {
		ArrayList<BuyDTO> list = new ArrayList<>();
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM buytbl ");
			
			while(rs.next()) {
				String username = rs.getString("username");
				String prodname = rs.getString("prodName");
				int price = rs.getInt("price");
				int amount = rs.getInt("amount");
				
				BuyDTO dto = new BuyDTO(username, prodname, price, amount);
				list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int insert(BuyDTO dto) {
		String sqlForamt = "INSERT INTO"
				+ "	 						buytbl(username, prodName, price, amount)\r\n"
				+ "						VALUES ('%s','%s',%d,%d) ";
		String sql = String.format(sqlForamt, dto.getUsername(),
																			dto.getProdname(),dto.getPrice(),dto.getAmount());
		Connection conn = dbClient.getConnection();
		int resultRowCount = 0;
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			System.err.println("틀린게 없는지 잘 확인해 주세요");
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

	@Override
	public int update(BuyDTO dto, String targetprodName) {
		String sqlFormat = "UPDATE buytbl"
				+ "	SET prodName = '%s',price = %d, amount = %d "
				+ "    WHERE prodName = '%s' ";
		
		String sql = String.format(sqlFormat,dto.getProdname(),dto.getPrice(),dto.getAmount(),targetprodName);
		int resultRow = 0;
		
		try (Connection conn = dbClient.getConnection();
				Statement stmt = conn.createStatement();){
			resultRow = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
				return resultRow;
	}

	@Override
	public boolean delete(String username) {
		boolean isOk = true;
		String sqlFormat = "DELETE FROM buytbl WHERE username = '%s' ";
		String sql = String.format(sqlFormat, username);

		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			isOk = false;
			// 실행에 흐름이 여기로 빠졌을 경우
			// 구매 테이블에 데이터가 남아있어서 ,유저 테이블에 삭제가 가능하다. 
		} catch (Exception e) {
			// TODO: handle exception
		} 
		finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return isOk;
		
		
	}
	




	
	
	
}
