package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		//1. 프레임을 만들어보세요.
		//2. 프레임을 설정해보세요. 실행해서 눈으로 확인
		//3. 레이아웃
		
		
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.setLayout(null);
		
		JButton[] buttons = new JButton[500];
		Random r = new Random();
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + i);
					
		}
		
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(800);
			int y = r.nextInt(800);
			buttons[i].setBounds(x, y, 100, 50);;
			
			f.add(buttons[i]);
		}
		
			Color[] color = {Color.red, Color.blue, Color.white, Color.gray, Color.green};
			for (int i = 0; i < buttons.length; i++) {
					buttons[i].setBackground(color[r.nextInt(5)]);
			}
			
			
			f.getContentPane().setBackground(Color.yellow);
		
			f.setVisible(true);
		
	}

}
