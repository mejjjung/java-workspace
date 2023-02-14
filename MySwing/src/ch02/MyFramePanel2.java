package ch02;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFramePanel2 extends JFrame{
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	
	// 패널 : 컴포넌트들을 그룹화 시킬 수 있다. 즉 각각에 배치관리자를 지정할 수 있다.
	private JPanel panel1;
	private JPanel panel2;
	
	
	
	
	public MyFramePanel2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("패널추가 연습");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		panel1.setBackground(Color.red);
		panel2 = new JPanel();
		panel2.setBackground(Color.yellow);
		
		
		// 버튼 초기화
		button1 = new JButton("button1");
		button1.setSize(100,50);
		
		button2 = new JButton("button2");
		button2.setSize(100,50);
		
		button3 = new JButton("button3");
		button3.setSize(100,50);
		
		button4 = new JButton("button3");
		button4.setSize(100,50);
		
		button5 = new JButton("button3");
		button5.setSize(100,50);
		
		button6 = new JButton("button3");
		button6.setSize(100,50);
		
		
	}
	
	private void setInitLayout() {
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		// 루트 패널 기본 레이아웃 BorderLayout이다
		// 하지만 추가적으로 만들어 사용하는 Panel은 기본 레이아웃이 FlowLayout이다. !!!
		panel1.setLayout(null);
		panel1.add(button1);
		button1.setLocation(100, 50);
		
		panel1.add(button2);
		button2.setLocation(250, 50);
		
		panel1.add(button3);
		button3.setLocation(400, 50);
		
		panel2.add(button4);
		button4.setLocation(250, 50);
		
		panel2.add(button5);
		button5.setLocation(250, 50);
		
		panel2.add(button6);
		button6.setLocation(250, 50);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFramePanel2();
	}
}