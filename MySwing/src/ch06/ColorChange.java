package ch06;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChange extends JFrame implements ActionListener {

	
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	
	public ColorChange() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		button1  = new JButton("빨");
		button2  = new JButton("주");
		button3  = new JButton("노");
		button4  = new JButton("초");
		button5  = new JButton("파");
		button6  = new JButton("남");
		button7  = new JButton("보");
	}
	private void setInitLayout() {
		// Frame의 기본 레이아웃은 borderLayout이다!

		add(panel);
		panel.setBackground(Color.yellow);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		setVisible(true);
	}
	private void addEventListener() {
		// this - > ColorChange --> ActionListener 타입으로 바라 볼 수 있다.
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
	}
	
	// 테스트 코드
	public static void main(String[] args) {
		new ColorChange();
		

	} // end of main

	// 약속 되어진 메서드
	// 이벤트가 일어나면 운영체제가 actionPerformed 메서드를 호출 시켜 준다. 
	@Override
	public void actionPerformed(ActionEvent e) {
		//e.getSource() --> Object
		// 다운 캐스팅 버튼으로 코드 작성
		JButton targetButton = (JButton)e.getSource();
		// targetButton.setText("눌러짐 버튼입니다.");
		System.out.println(targetButton.getText());
	
//		System.out.println(e.getSource());
//		if(e.getSource() == this.button1) {
//			panel.setBackground(Color.gray);
//		} else {
//			panel.setBackground(Color.yellow);
//		}

		// 문제 1
		// 문자열을 비교해서 색상 변경 시키는 코드를 작성해 주세요
			if(targetButton.getText().equals(this.button1.getText())) {
				panel.setBackground(Color.red);
			} else if (targetButton.getText().equals(this.button2.getText())) {
				panel.setBackground(Color.orange);
			} else if (targetButton.getText().equals(this.button3.getText())) {
				panel.setBackground(Color.yellow);
			} else if (targetButton.getText().equals(this.button4.getText())) {
				panel.setBackground(Color.green);				
			} else if (targetButton.getText().equals(this.button5.getText())) {
		panel.setBackground(Color.cyan);				
			} else if (targetButton.getText().equals(this.button6.getText())) {
				panel.setBackground(Color.blue);				
			} else {
				panel.setBackground(Color.pink);				
				
			}
		
		
	}

} // end of class 
