package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyFrame extends JFrame implements KeyListener {
	// 1. implements 처리
	// 2. 익명 클래스

	private JTextArea area;
	
	public MyKeyFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	public void initData() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		area = new JTextArea();
	}
	
	public void setInitLayout() {
		add(area);
		setVisible(true);
	}
	public void addEventListener() {
		KeyListener keyListener;
		area.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("key Typed :" + e.toString());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("key Pressed :" + e.toString());
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("key Released :" + e.toString());
		
	}
	
	public static void main(String[] args) {
		new MyKeyFrame();
	}
	
}
