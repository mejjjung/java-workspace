package ex13;

import java.util.Random;

public class MainTest {

	public static void main(String[] args) {

		// 우리반 학생 이름들을 배열에 담아주세요
		// 랜덤 클래스를 사용해서 
		// 한명을 추출해 주세요 ~ 
		Random random = new Random();
		int rNum = random.nextInt(18);
		String[] students = new String[18];
		
		students[0] = "김미정";
		students[1] = "김민우";
		students[2] = "김현우";
		students[3] = "전대영";
		students[4] = "이서영";
		students[5] = "이치승";
		students[6] = "정다운";
		students[7] = "이지운";
		students[8] = "박성희";
		students[9] = "김지현";
		students[10] = "이현서";
		students[11] = "김유주";
		students[12] = "손주이";
		students[13] = "한범진";
		students[14] = "강민정";
		students[15] = "배진석";
		students[16] = "김효린";
		students[17] = "편용림";
		
		System.out.println(students[rNum]);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
