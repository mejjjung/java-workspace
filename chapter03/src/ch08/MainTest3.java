package ch08;

public class MainTest3 {

	public static void main(String[] args) {

		try {
			int result = 10 / 0;

		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}

		Caculator caculator = new Caculator();
		

	}

}

class Caculator {

	int result;

	public int test() throws ArithmeticException {
		result = 10 / 0;
		return result;
	}

}