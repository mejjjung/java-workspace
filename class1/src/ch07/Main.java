package ch07;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		A a = new A();

		// 문제
		// d object에 있는 value값을 화면에 출력해주세요		
		System.out.println(a.b.c.d.value);
		System.out.println(a.b.c.d.arrayList.get(0));
		System.out.println(a.b.c.d.arrayList.get(1));
		System.out.println(a.b.c.d.arrayList.get(2));
		System.out.println(a.b.c.d.arrayList.get(3));
		
		System.out.println("----------------");
		for (String string : a.b.c.d.arrayList) {
			System.out.println(string);
		}	
		System.out.println("----------------");
		for(int i = 0; i < a.b.c.d.arrayList.size(); i++) {
			System.out.println(a.b.c.d.arrayList.get(i));
		}
		
	}

}
