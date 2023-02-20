package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


	public class MouseEventListener1 extends JFrame {
		
		private JLabel labelText;
		private int labelTextX;
		private int labelTextY;

		public MouseEventListener1() {
			initData();
			setInitLayout();
			addEventListner();
		}
		public void initData() {
			setSize(800,800);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(false);
			// 기본 초기값 세팅
			labelTextX = 300;
			labelTextY = 350;
			
			labelText = new JLabel("Hello World");
			labelText.setSize(100,100);
		}
		public void setInitLayout() {
			setLayout(null);
			labelText.setLocation(labelTextX, labelTextY);
			add(labelText);
			setVisible(true);
		}
		
		public void addEventListner() {
			this.addMouseListener(null);
				
			
		
		
		
				
			
		}
		
	
	
	
	
	
}
