package ex01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PlayerEx extends JLabel implements MoveableEx {

	private int x;
	private int y;
	private ImageIcon playerR, playerL;
	
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;
	
	
	
	
	public PlayerEx() {
		initData();
		setInitLayout();
	}
	
	
	private void initData() {
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
		x -= 10;
		setLocation(x, y);
		
	}

	@Override
	public void right() {
		setIcon(playerR);
		x += 10;
		setLocation(x, y);
		
	}

	@Override
	public void up() {
		System.out.println("점프!!");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		
	}
}
