package ch04;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		// 데이터베이스에 접근해서 memberTBL에 대한 정보
		// 데이터베이스에 접근해서 userTBL에 대한 정보 

		UserDAO userDAO = new UserDAO();
//		자식 테이블에 데이터를 먼저 삭제하고 부모테이블에 정보를 삭제할 수 있다
		// 이승기는 구매 테이블 이력이 남아있기 때문에 유저테이블에서 바로 삭제할 ㅜㅅ 없다..
		boolean isDelete = userDAO.delete("이승기");
		System.out.println("isDelete : " + isDelete);
		if(isDelete == false) {
			System.out.println("구매테이블에 이력이 남아 있을 수 있습니다.");
		}
		// insert 확인
//		UserDTO dto = new UserDTO("유진스","1995","부산","010-2222-2222");
//		int updateRowCount = userDAO.update(dto,dto.getUsername());
//		System.out.println("updateRowCount : " + updateRowCount);
//		int rowCount = userDAO.insert(new UserDTO("신짱구","2020","서울","010-1234-1234"));
//		System.out.println("rowCount : " + rowCount);
		
		
		
		// select  확인 
//		ArrayList<UserDTO> list = userDAO.select();
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getUsername());
//			System.out.println(list.get(i).getBirthYear());
//			System.out.println(list.get(i).getAddr());
//			System.out.println(list.get(i).getMobile());
//			System.out.println("-----------------------------");
//		}
		
		
	}

}
