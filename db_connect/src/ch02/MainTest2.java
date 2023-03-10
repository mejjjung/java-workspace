package ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest2 {

	public static void main(String[] args) {
		
		// 코드 실행 
		DBClient dbClient = new DBClient();
		DBClient.setDB_NAME("shopdb");
		// dbClient.setDB_NAME("shopdb");
		
		// DB 접근 구현 코드 처리 
		// 자료 구조 선언, 담을 데이터를 클래스로 모델링 
		
		
		ArrayList<Person> list = new ArrayList<>();
		
		Connection conn = dbClient.getConnection();
		try {
			Statement stmt = conn.createStatement();
			String queryPf = "SELECT * FROM person";
			ResultSet rs = stmt.executeQuery(queryPf);
			
			while(rs.next()) {
				Person person = 
						new Person(rs.getInt("person_id"),rs.getString("name"));
				list.add(person);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println(list.get(i).getId());
			System.out.println(list.get(i).getName());
		}
		
	}

}

class Person {
	
	private int id;
	private String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	
}