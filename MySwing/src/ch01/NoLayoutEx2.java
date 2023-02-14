package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame {
	
	private JButton  button1;
	private JButton  button2;
	private JButton  button3;
	private JButton  button4;
	private JButton  button5;
	private JButton  button6;
	

	public NoLayoutEx2() {
		iniData();
		setInitLayout();
	}
	
	private void iniData() {
		setTitle("버튼만들기연습해용~");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("안녕하세용?");
		button1.setSize(200,100);
		button2 = new JButton("안녕하세용2");
		button2.setSize(200, 100);
		button3 = new JButton("김미정");
		button3.setSize(200, 100);
		button4 = new JButton("입니다.");
		button4.setSize(200, 100);
		button5 = new JButton("눌러보세용");
		button5.setSize(200, 100);
		button6 = new JButton("누르지마세여ㅡㅡ");
		button6.setSize(200, 100);
	}
		private void setInitLayout() {	
			setLayout(null); 
			button1.setLocation(100, 100);
			add(button1);
			button2.setLocation(200, 200);
			add(button2);
			button3.setLocation(300, 300);
			add(button3);
			button4.setLocation(500, 300);
			add(button4);
			button5.setLocation(600, 200);
			add(button5);
			button6.setLocation(600, 600);
			add(button6);
			setVisible(true);
	}
	
		
		public static void main(String[] args) {
			new NoLayoutEx2();
		}
		
}
