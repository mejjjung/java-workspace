package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame {
	
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private FlowLayout flowLayout;
	// 1단계 JButton 2개 생성
	// 배치관리자 FlowLayout 멤버 변수로 선언
	// 화면에 Component를 그려 주세요!
	

	public FlowLayoutEx2() {
		 initData();
		 setInitLayout();
	}
	
	private void initData() {
		setTitle("FlowLayoutEx2");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// for
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		flowLayout = new FlowLayout(FlowLayout.RIGHT,20,20);
	}
	
	private  void setInitLayout() {
		setLayout(flowLayout);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
	}
	
}
