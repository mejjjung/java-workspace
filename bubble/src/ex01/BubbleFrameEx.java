package ex01;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrameEx extends JFrame {

	private JLabel backgroundMap;
	private Player player;
	
	public BubbleFrameEx() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000,640);
		
		player = new Player();
	}
	
	private void setInitLayout() {
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(player);
	}
	
	private void addEventListener() {
		
	}
	
	public static void main(String[] args) {
		new BubbleFrame();
	}
}
