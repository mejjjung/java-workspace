package ex02;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LottoeryGame extends JFrame implements ActionListener {
	private JLabel backgroundMap;
	int[] lotto = new int[6];
	JButton button;

	public LottoeryGame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	public void initData() {
		setTitle("로또 생성기");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("로또 시작");
		Icon icon = new ImageIcon("images/image3.png");
		backgroundMap = new JLabel(icon);
		backgroundMap.setSize(500,500);
	}
	
	public void setInitLayout() {
		 add(button,BorderLayout.NORTH );
		 add(backgroundMap);
		backgroundMap.setLocation(0, 0);
		setLayout(null);
		setVisible(true);
	}
	
	public void addEventListener() {
		button.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("게임 시작");
		int[] lotto = getLottoNumber();
		for(int i = 0; i <lotto.length; i++) {
			System.out.println("lotto : " + lotto[i]);
		}
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font f = new Font("궁서체",Font.ITALIC,20);
		g.setFont(f);
		if(lotto[0] == 0) {
			g.drawString("로또 번호를 클릭하세요", 180, 100);
			return;
		}
		for(int i = 0, x = 50; i < lotto.length; i++, x += 100) {
			g.drawString(lotto[i] + "", x, 200);
		}
	}
	
	
	
	public int[] getLottoNumber() {
		Random r = new Random();
		for(int i = 0; i < lotto.length; i++) {
			int j = r.nextInt(45) + 1;
			lotto[i] = j;
			for(int e = 0; e < i; e++) {
				if(lotto[i] == lotto[e]) {
					i -= i -1;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}
	
	
	
	public static void main(String[] args) {
		new LottoeryGame();
	}
}
