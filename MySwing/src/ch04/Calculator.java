package ch04;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator extends JFrame {
	private JPanel panel1;
	
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
	private JButton button14;
	private JButton button15;
	private JButton button16;
	private JButton button17;
	private JButton button18;
	private JButton button19;
	private JButton button20;
	
	

	public Calculator() {
		initData();
		setInitLayout();
	}
	
	public void initData() {
		setTitle("계산기");
		setSize(350,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		button1 = new JButton("%");
		button2 = new JButton("CE");
		button3 = new JButton("C");
		button4 = new JButton("X");
		button5 = new JButton("7");
		button6 = new JButton("8");
		button7 = new JButton("9");
		button8 = new JButton("X");
		button9 = new JButton("4");
		button10 = new JButton("5");
		button11 = new JButton("6");
		button12 = new JButton("-");
		button13 = new JButton("1");
		button14 = new JButton("2");
		button15 = new JButton("3");
		button16 = new JButton("+");
		button17 = new JButton("+/-");
		button18 = new JButton("0");
		button19 = new JButton(".");
		button20 = new JButton("=");
		
	}
	
	public void setInitLayout() {
		panel1.setLayout(null);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(button10);
		add(button11);
		add(button12);
		add(button13);
		add(button14);
		add(button15);
		add(button16);
		add(button17);
		add(button18);
		add(button19);
		add(button20);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Calculator();
	}
	
	
	
}
