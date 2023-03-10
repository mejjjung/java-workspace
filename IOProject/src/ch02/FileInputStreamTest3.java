package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			byte[] bs = new byte[10];
			int i;
			while(   ( i = fis.read(bs) ) != -1  ) {
				for(int k = 0; i < i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println("줄바꿈");
			}			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어요");
		} catch (IOException e) {
			System.out.println("입력 스트림 동작 시 오류 발생 했네요");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end of main 

} // end of class 
