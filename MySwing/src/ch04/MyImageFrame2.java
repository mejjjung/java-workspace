package ch04;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Paint;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class MyImageFrame2 extends JFrame {

	private ImagePanel imagePanel;
	private ImagePanel2 imagePanel2;
	
	
	
	// 정적  내부 클래스
	static class ImagePanel extends JPanel {
		private Image image;
		
		 public ImagePanel() {
			image = new ImageIcon("image2.png").getImage();
		}
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 100, 100, 100, 100, null);
			g.drawImage(image, 300, 300, 300,	300, null);
		}
	} // end of inner class 
	
	// 정적 내부 클래스 2
	 class ImagePanel2 extends JPanel {
		private Image image2;
		
		public ImagePanel2() {
			image2 = new ImageIcon("image4.png").getImage();
		}
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image2, 400,400,400,400,null);
		}
	} // end of inner class 2
	 
	 
	public MyImageFrame2() {
		initData();
		setInitLayout();
		
	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);
	}

	private void initData() {
		setTitle("내부클래스란");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}
}
