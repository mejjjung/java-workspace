package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Test1111 extends JFrame{

	private JButton button1;
	private JLabel label; // 글자를 넣어서 화면에 띄울수 있다.
	private JTextField textField; // 사용자들한테 입력값을 받을수 있는 컴포넌트
	private JPasswordField jPasswordField; // 사용자 비번을 받는 컴포넌트
	private JCheckBox checkBox; // 체크박스
	

	public Test1111() {
		initData();
		setInitLayout();
	}
	
	public void initData() {
		setTitle("컴포넌트 연습");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("버튼을 눌러주세요");
		label = new JLabel("글자를 적는 컴포넌트");
		textField = new JTextField("아이디입력",20);
		jPasswordField = new JPasswordField("비번입력",10);
		checkBox = new JCheckBox("동의");
		
	}
	
	public void setInitLayout() {
		add(button1);
		add(label);
		add(jPasswordField);
		add(textField);
		add(checkBox);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	
	
	
	
	
	
}
