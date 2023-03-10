package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream3 {

	public static void main(String[] args) {
		// output3.txt
		// hello world를 찍어주세요
		
		FileOutputStream fos = null;
		byte[] bs = new byte[10];
		bs[0] = 72;
		bs[1] = 69;
		bs[2] = 76;
		bs[3] = 76;
		bs[4] = 79;
		bs[5] = 87;
		bs[6] = 79;
		bs[7] = 76;
		try {
			fos = new FileOutputStream("output3.txt");
			
				fos.write(bs);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	

	} // end of main

}
