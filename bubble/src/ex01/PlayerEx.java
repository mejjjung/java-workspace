package ex01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PlayerEx extends JLabel implements MoveableEx {

	private int x;
	private int y;
	private ImageIcon playerR, playerL;
	
	public PlayerEx() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
	}
	
	private void setInitLayout() {
		x = 55;
		y = 535;
		setSize(50,50);
		setLocation(x, y);
		setIcon(playerR);
	}

	@Override
	public void left() {
		setIcon(playerL);
		
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		
	}
}
