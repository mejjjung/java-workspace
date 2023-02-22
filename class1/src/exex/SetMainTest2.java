package exex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMainTest2 {

	public static void main(String[] args) {
		HashSet<Integer> numberSet = new HashSet<>();
		
		Iterator<Integer> iter = numberSet.iterator();
		
		int count = 0;
		while(numberSet.size() != 6) {
			count++;
			numberSet.add(getRandomNumber());
		}
		System.out.println(numberSet.toString());
		System.out.println("반복 횟수 : " + count);
	}

	public static int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(45) + 1;
	}
	
	
}
