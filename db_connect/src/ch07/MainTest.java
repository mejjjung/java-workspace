package ch07;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		
		BlogDAO blogDAO = new BlogDAO();
			
		// select 
//		ArrayList<BlogDTO> list = blogDAO.showTitleBlogInfo("신짱구");
//		
//		for(int i = 0; i < list.size(); i++) {
//			String userName = list.get(i).getUserName();
//			String postSubject = list.get(i).getPostSubject();
//			String updateDate = list.get(i).getUpdateDate();
//			String reply = list.get(i).getReply();
//			String createReply = list.get(i).getCreateReply();
//			System.out.println("userName : " + userName);
//			System.out.println("postSubject : " + postSubject);
//			System.out.println("updateDate : " + updateDate);
//			System.out.println("reply : " + reply);
//			System.out.println("createReply : " + createReply);
//		}

		// insert
		int rowCount = blogDAO.insert(new BlogDTO(5, "흰둥이"));
		System.out.println("rowCount : " + rowCount);
		
	}

}
