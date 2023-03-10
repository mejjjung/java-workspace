package ch04;

import java.util.ArrayList;

public class BuyMainTest {

	public static void main(String[] args) {
		
		BuyDAO buyDAO = new BuyDAO();
		
		 // insert 확인
//		int rowCount = buyDAO.insert(new BuyDTO("신짱구", "초코비", 1500, 2));
//		System.out.println("rowCount : " + rowCount);
		
		// update
//		BuyDTO dto = new BuyDTO("모니터","초코비",10000,2);
//		int updateRowCount = buyDAO.update(dto, dto.getUsername());
//		System.out.println("updateRowCount : " + updateRowCount);
		
		// delete
		boolean isDelete = buyDAO.delete("유진스");
		System.out.println("isDelete : " + isDelete);
		
		
		
		
//		ArrayList<BuyDTO> list = buyDAO.select();
//		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getUsername());
//			System.out.println(list.get(i).getProdname());
//			System.out.println(list.get(i).getPrice());
//			System.out.println(list.get(i).getAmount());
//			System.out.println("-------------------------");
//		}
	}

}
