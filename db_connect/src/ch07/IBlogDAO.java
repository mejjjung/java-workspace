package ch07;

import java.util.ArrayList;

public interface IBlogDAO {

	
	ArrayList<BlogDTO>showTitleBlogInfo(String title);
	int insert(BlogDTO dto);
	
	
}
