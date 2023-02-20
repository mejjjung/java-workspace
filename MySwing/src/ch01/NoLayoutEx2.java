package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button10;
	private JButton button11;
	private JButton button12;
	private JButton button13;

	public NoLayoutEx2() {
		iniData();
		setInitLayout();
	}

	private void iniData() {
		setTitle("버튼만들기연습해용~");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1 = new JButton("안녕하세용");
		button1.setSize(200, 100);
		button2 = new JButton("안녕하세용");
		button2.setSize(200, 100);
		button3 = new JButton("김미정");
		button3.setSize(200, 100);
		button4 = new JButton("입니다.");
		button4.setSize(200, 100);
		button5 = new JButton("눌러보세용");
		button5.setSize(200, 100);
		button6 = new JButton("누르지마세여");
		button6.setSize(200, 100);
		button7 = new JButton("눌러도돼여");
		button7.setSize(200, 100);
		button8 = new JButton("111");
		button8.setSize(200, 100);
		button9 = new JButton("222");
		button9.setSize(200, 100);
		button10 = new JButton("333");
		button10.setSize(200, 100);
		button11 = new JButton("444");
		button11.setSize(200, 100);
		button12 = new JButton("555");
		button12.setSize(200, 100);
		button13 = new JButton("666");
		button13.setSize(200, 100);
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
		button6.setLocation(700, 100);
		add(button6);
		button7.setLocation(400, 400);
		add(button7);
		button8.setLocation(300, 500);
		add(button8);
		button9.setLocation(500, 500);
		add(button9);
		button10.setLocation(200, 600);
		add(button10);
		button11.setLocation(100, 700);
		add(button11);
		button12.setLocation(600, 600);
		add(button12);
		button13.setLocation(700, 700);
		add(button13);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NoLayoutEx2();
	}

}
