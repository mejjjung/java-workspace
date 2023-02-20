package ch08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame implements ActionListener {
	int[] lotto = new int[6];
	JButton button;

	public LottoFrame() {
		// TODO Auto-generated constructor stub
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Lotto");
		button = new JButton("Lotto Start");
	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("게임 시작");
		int[] lotto = getLottoNumber();
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("lotto : " + lotto[i]);
		}
		// 여기에 코드 입력 해주세요
		// 그림을 다시 그리다
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// g.setColor(Color.black);
		Font f = new Font("궁서체", Font.BOLD, 20);
		g.setFont(f);
		if (lotto[0] == 0) {
			// 게임 초기 상태
			g.drawString("로또 번호를 클릭하세요", 180, 100);
			return;
		}
		// 코드가 여기 내려오면 버튼을 눌렀다와 같은 의미 이다.
		// 그럼 메서드와 멤버 변수를 활용해서 그림을 그릴 수 있다.
		
		// 추천하지 않는 코드 
		for(int i = 0,  x = 50; i < lotto.length; i++, x += 100) {
			g.drawString(lotto[i] + "", x, 200);
		
		}
//		g.drawString(lotto[0] + "", 50, 200); // <-- 여기서 오류 나는 이유는 뭘까요?
//		g.drawString(lotto[1] + "", 150, 200); // <-- 여기서 오류 나는 이유는 뭘까요?
//		g.drawString(lotto[2] + "", 250, 200); // <-- 여기서 오류 나는 이유는 뭘까요?
//		g.drawString(lotto[3] + "", 350, 200); // <-- 여기서 오류 나는 이유는 뭘까요?
//		g.drawString(lotto[4] + "", 450, 200); // <-- 여기서 오류 나는 이유는 뭘까요?
//		g.drawString(lotto[5] + "", 550, 200); // <-- 여기서 오류 나는 이유는 뭘까요?
	}

	public int[] getLottoNumber() {
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			int j = r.nextInt(45) + 1;
			lotto[i] = j;
			// 중복값 확인을 위해 반복문을 생성
			for (int e = 0; e < i; e++) {
				// 조건
				if (lotto[i] == lotto[e]) {
					i = i - 1;
					break;
				}
			}
			// 오름 차순 정렬
		} // end of for
		Arrays.sort(lotto); // 배열을 정렬 해주는 기능
		return lotto;
	}

	// 테스트 코드
	public static void main(String[] args) {
		LottoFrame a = new LottoFrame();
	}// end of main
}// end of class
