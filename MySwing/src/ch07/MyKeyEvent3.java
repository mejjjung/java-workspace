package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MyKeyEvent3 extends JFrame implements KeyListener {


	private JTextArea area;
	// 구현 클래스를 keyListener 이름을 붙이다.
	private KeyListener keyListener = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	};
	
	
	public MyKeyEvent3() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	public void initData() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 프레임 사이즈 조절 불가 설정 
		area = new JTextArea();
	}
	public void setInitLayout() {
		add(area);
		setVisible(true);
	}
	private void addEventListener() {
		// 익명 클래스
		// 익명 구현 클래스 :
		// 인터페이스 + 추상 클래스를 구현 클래스로 만들 수 있다.
		KeyListener keyListener;

		// 인터페이스를 기본적으로 new할 수 있다.
		// 하지만 인터페이스를 구현 클래스로 변형해서 사용할 수 있다.
		
		area.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyCode());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	// 문자에 반응 한다.
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("key Typed : " + e.toString());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed : " + e.toString());
		// 제어문 활용해서
		// 방향키 위 가 눌러졌으면 콘솔에 up 이란 문자열을 출력
		// 왼쪽, 오른쪽, 아래
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			area.append("방향키 위\n");
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			area.append("방향키 아래\n");
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			area.append("방향키 왼쪽\n");
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			area.append("방향키 오른쪽\n");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyReleased : " + e.toString());
		
	}
	
}
