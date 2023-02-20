package ch09;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class LottoFrame extends JFrame {
	
	JButton button;
	LottoRandomNumber lottoRandomNumber;
	boolean isStart = false;
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Lotto Game");
		button = new JButton("로또 시작!");
		lottoRandomNumber = new LottoRandomNumber();
	}
	
	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}
	
	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("로또 게임을 시작합니다.");
				int[] lotto = lottoRandomNumber.getLottoNumber();
				for(int i = 0; i < lotto.length; i++) {
					System.out.println("lotto : " + lotto);
				}
				
				repaint();
				
			}
		});
	}
	// 화면을 담당 !!
	// LottoRandomNumber 클래스에 받아서 처리해 보자
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font f = new Font("돋움체", Font.ITALIC, 20);
		g.setFont(f);
		if(isStart == false) {
			g.drawString("게임을 실행해 주세요", 150, 150);
			return;
		}
		
		}


	
}
