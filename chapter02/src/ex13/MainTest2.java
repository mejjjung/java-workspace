package ex13;

public class MainTest2 {

	public static void main(String[] args) {
		int[] myNumbers = new int[10];
		myNumbers[0] = 10;
		myNumbers[1] = 4;
		myNumbers[2] = 100;
		myNumbers[3] = 23;
		myNumbers[4] = 51;
		myNumbers[5] = 1;
		myNumbers[6] = 6;
		myNumbers[7] = 88;
		myNumbers[8] = 42;
		myNumbers[9] = 31;

		// 오름차순 정렬
		// for if문

		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = 0; j < myNumbers.length - 1 - i; j++) {
				if (myNumbers[i] > myNumbers[j + 1]) {
					int tmp = myNumbers[j];
					myNumbers[j] = myNumbers[j + 1];
					myNumbers[j + 1] = tmp;
					System.out.println(myNumbers[i]);
				}
			}
		}

	}

}
