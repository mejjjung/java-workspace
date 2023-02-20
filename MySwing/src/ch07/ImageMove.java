package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageMove extends JFrame implements Moveable {

	private JLabel labelImage;
	private int labelImageX;
	private int labelImageY;

	public ImageMove() {
		initData();
		setInitLayout();
		addEventListner();
	}

	public void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		labelImageX = 300;
		labelImageY = 350;
		Icon icon = new ImageIcon("images/image9.png");
		labelImage = new JLabel(icon);
		labelImage.setSize(100, 120);

	}

	public void setInitLayout() {
		setLayout(null);
		labelImage.setLocation(labelImageX, labelImageY);
		add(labelImage);
		setLayout(null);
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
		if (labelImageX > 0) {
			int x = labelImageX -= 50;
			int y = labelImageY;
			labelImage.setLocation(x, y);
		}
	}

	@Override
	public void right() {
		if (labelImageX + 50 < 750) {
			int x = labelImageX += 50;
			int y = labelImageY;
			labelImage.setLocation(x, y);
		}

	}

	@Override
	public void up() {
		if (labelImageY > 0) {
			int x = labelImageX;
			int y = labelImageY -= 50;
			labelImage.setLocation(x, y);
		}

	}

	@Override
	public void down() {
		if (labelImageY + 50 < 700) {
			int x = labelImageX;
			int y = labelImageY += 50;
			labelImage.setLocation(x, y);
		}
	}

	public static void main(String[] args) {
		new ImageMove();
	}

}
