package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame2 extends JFrame implements Moveable {

	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;
	

	public MoveLabelFrame2() {
		initData();
		setInitLayout();
		addEventListner();
	}

	public void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		// 기본 초기값 세팅
		labelTextX = 300;
		labelTextY = 350;

		labelText = new JLabel("Hello World");
		labelText.setSize(100, 100);
	}

	public void setInitLayout() {
		setLayout(null);
		labelText.setLocation(labelTextX, labelTextY);
		add(labelText);
		setVisible(true);
	}

	public void addEventListner() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// 현재 이벤트가 일어난 시점에 x, y 좌표값을 확인
//				int currentX = labelText.getX();
//				int currentY = labelText.getY();
				
		
				

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
		}	

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	@Override
	public void left() {
		int x = labelTextX -= 50;
		int y = labelTextY;
		labelText.setLocation(x, y);

	}

	@Override
	public void right() {
		int x = labelTextX += 50;
		int y = labelTextY;
		labelText.setLocation(x, y);

	}

	@Override
	public void up() {
		int x = labelTextX;
		int y = labelTextY -= 50;
		labelText.setLocation(x, y);

	}

	@Override
	public void down() {
		int x = labelTextX;
		int y = labelTextY += 50;
		labelText.setLocation(x, y);
	}

}
