package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼랜덤하게만들어보기 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		//버튼 200개 들어갈 배열을 만들자.
		//버튼 200개를 만들어 배열에 저장
		f.getContentPane().setBackground(Color.yellow);
		JButton[] buttons = new JButton[200];
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + i);
		}
		
		// 위치를 지정해서 넣어주자.
		
		f.setLayout(null); // 위치 자동으로 잡아주는 부품 안 씀.
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			int x= r.nextInt(800);
			int y= r.nextInt(700);
			buttons[i].setBounds(x, y, 100, 50);
			
			f.add(buttons[i]);
		}
		
		
		//null => 조립해서 넣을 부품의 주소가 랩에 없음.
		// 첫번째 버튼을 가로 500, 세로 500 위치, 크기 100 * 50
		//위치와 크기만 지정
		//buttons[0].setBounds(500, 500, 100, 50);
		//buttons[1].setBounds(600, 600, 100, 50);
		
		//f에 올려주자
	
		
		f.setVisible(true);
		
	}
	
	
		
		
		
		
}
