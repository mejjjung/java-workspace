package ch05;

public class BoxMainTest {

	public static void main(String[] args) {
		Box<Banana> box1 = new Box<>();
		Box<Apple> box2 = new Box<>();
		
		
		Box<String> box = new Box<>();
		box.put("안녕 반가워~");
		System.out.println(box.isEmpty());
		System.out.println("----------------");
		
		String msg = box.take();
		System.out.println("msg : " + msg);
		System.out.println(box.isEmpty());
	}

}
