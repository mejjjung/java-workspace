package ch03;

import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 디비 접근해서 기능 수행하는 녀석은 ? 
	EmployeeDao employeeDao = new EmployeeDao();
	ArrayList<EmployeeDTO> list = employeeDao.select(10005);
	System.out.println("여기는 main");
	for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}

	}

}
