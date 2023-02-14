package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class FlowLayoutEx3 extends JFrame {
	JButton[] btn = new JButton[10 + 1];
	private FlowLayout flowLayout;
	

	// 멤버 변수를 선언할 수 있는가
	// 배열을 활용할 수 있는가
	// 생성자 + 메서드를 호출
	// for 문 활용할 수 있는가?
	// GUI 프로그램 익숙해 지기!!!

	public FlowLayoutEx3() {
		initData();
		setInitLayout();
		
	}
	
	private void initData() {
		setTitle("배열을 이용한 버튼만들기");
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new JButton("버튼" + i);
		}
		flowLayout = new FlowLayout(FlowLayout.RIGHT,20,20);
		
	}
	
	private void setInitLayout() {
		setLayout(flowLayout);
		for(int i = 0; i < btn.length; i++) {
				add(btn[i]);
		}
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx3();
	}
}
