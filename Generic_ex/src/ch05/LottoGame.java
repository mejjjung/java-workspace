package ch05;

import java.util.Arrays;
import java.util.Random;

public class LottoGame {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int[] lotto = new int[6];
		int temp;
		for(int i = 0; i < 6; i++) {
			lotto[i] = random.nextInt(45) + 1;
				for(int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
		
		
		
		
		
	}
	
	
	

}
