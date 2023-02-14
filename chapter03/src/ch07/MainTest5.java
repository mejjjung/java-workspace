package ch07;

public class MainTest5 {

	public static void main(String[] args) {
		
		// replace
		//replace([기존문자],[바꿀문자])
		// replace는 자신이 바꾸고 싶은 문자로 문자열을 치환해주는 기능을 한다.
		String str = "안녕하세요 홍길동입니다.";
		str = str.replace("홍길동", "김미정");
		System.out.println(str);
		
		// replaceAll
		//replaceAll([정규식],[바꿀문자])
		// 자신이 바꾸고 싶은 문자로 문자열을 전부 치환해주는 기능을 한다.
		String str2 = "홍길동이 여기저기 서에번쩍 동에번쩍 나타납니다";
		str2 = str2.replaceAll("번쩍", "반짝");
		System.out.println(str2);
		
		// concat
		// concat 메서드를 이용해서 텍스트 합쳐서 출력해주는 기능을 한다.
		String text1 = "안녕하세요";
		String text2 = "김미정입니다. 27살이에여";
		String result = text1.concat(text2);
		System.out.println(result);
		
	}

}
