package MapleStory;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MapleFrame extends JFrame {

	private JLabel backgroundMap;
	
	public MapleFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/maple.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(850,530);
	}
	
	private void setInitLayout() {
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void addEventListener() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new MapleFrame();
	}
}


