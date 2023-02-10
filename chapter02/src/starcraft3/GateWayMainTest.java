package starcraft3;

public class GateWayMainTest {

	public static void main(String[] args) {
		
		GateWay gateWay1 = new GateWay();
		Zealot[] zealots = gateWay1.createZelot(30);
		System.out.println(zealots[0]);
		System.out.println(zealots[1]);
		System.out.println(zealots[2]);
		System.out.println(zealots[4]);
		System.out.println(zealots[5]);
	}

}
