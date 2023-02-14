package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEX1 extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	
	public FlowLayoutEX1() {
		initData();
		setInitLayout();
	}
	
	public void initData() {
		setTitle("버튼만들기 연습");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("버튼11");
		button2 = new JButton("버튼12");
		button3 = new JButton("버튼13");
		button4 = new JButton("버튼14");
		button5 = new JButton("버튼15");
		button6 = new JButton("버튼16");
		
	}

	public void setInitLayout() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT,10,200));
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
	}

	public static void main(String[] args) {
		new FlowLayoutEX1();
	}





}
