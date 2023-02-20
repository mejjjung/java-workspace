package ch08;

import java.util.Arrays;
import java.util.Random;

public class LottoGame {

	public void randomlotto() {
		Random random = new Random();
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		System.out.println("당첨 번호는 " + Arrays.toString(lotto) + " 입니다.");
	}

}
