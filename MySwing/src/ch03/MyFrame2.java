package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2  extends JFrame {

	MyDrawPanel drawPanel;
	
	class MyDrawPanel extends JPanel {
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(600, 300, 500, 500);
			g.drawString("π ", 40	, 40);
			g.drawString("π ", 100	, 20);
			g.drawString("π ", 200	, 30);
			g.drawString("π ", 300	, 40);
			g.drawString("π ", 400	, 30);
			g.drawString("π ", 500	, 20);
			g.drawString("π ", 600	, 30);
			g.drawLine(1000,100,1000,220);
			g.drawLine(1000,100,1080,100);			
			g.drawLine(1080,100,1080,284);
			g.drawLine(975,400,975,550);
			g.drawLine(975,400,975,550);
			g.drawLine(650,480,800,480);
			g.drawLine(900,480,1050,480);
			g.drawLine(730,400,730,550);
			g.drawString("π ", 700	, 40);
			g.drawString("π ", 800	, 30);
			g.drawString("π ", 900	, 20);
			g.drawString("π ", 1000, 40);
			g.drawString("π ", 1100	, 30);
			g.drawString("π ", 1200	, 20);
			g.drawString("π ", 1300	, 40);
			g.drawString("π ", 1400	, 30);
			g.drawString("π ", 1100	, 30);
			g.drawString("π ", 1500	, 20);
			g.drawString("π ", 1600	, 30);
			g.drawString("π ", 1700	, 20);
			g.drawString("π ", 1800	, 40);
			g.drawString("π ", 1900	, 30);
			g.drawRect(650, 400, 150, 150);
			//g.drawRect(750, 500, 130, 130);
			g.drawRect(900, 400, 150, 150);
			g.drawRect(800, 650, 100, 150);
			g.drawLine(850, 100, 600, 300);
			g.drawLine(1100, 300, 850, 100);
			g.drawOval(830, 500, 50, 50);
			
			g.drawRect(130, 815, 60, 60);
			g.drawRect(150, 875, 150, 50);
			g.drawRect(148, 830, 5, 5);
			g.drawRect(165, 830, 5, 5);
			g.drawRect(145, 850, 30, 5);
			g.drawRect(150, 800, 20, 20);
			g.drawRect(130, 800, 15, 15);
			g.drawRect(175, 800, 15, 15);
			g.drawRect(180, 925, 15, 40);
			g.drawRect(200, 925, 15, 40);
			g.drawRect(240, 925, 15, 40);
			g.drawRect(260, 925, 15, 40);
			
			
		}
		
	}
	
	// λ΄λΆ ν΄λμ€λ₯Ό νμ©ν΄μ 
	// Jpanel λ₯Ό μμ λ°κ³  paint λ©μλλ‘ 
	// μ§ κ·Έλ¦Όμ κ·Έλ € μ£ΌμΈμ
	// cafe --> κ²°κ³Ό μ¬μ§ μ¬λ €μ£ΌμΈμ !!!

	
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	public void initData() {
		setTitle("μ§λ§λ€κΈ°");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}
	
	public void setInitLayout() {
		add(drawPanel);
		setVisible(true);
	}
	
}
