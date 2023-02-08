package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 자주써서 ram에 언제든 사용할 수 있도록 준비되어있다.
		//		망치
		// 		부품명.기능()
		
		// 2. 쓸 때마다 제공되는 틀을 이용해서 찍어내어 여러개 만들어
		//		ram에 저장해두고 사용
		//		벽돌
		//		벽돌 b = new 벽돌();
		
		JFrame f = new JFrame();
		f.setSize(400, 300);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel label1 = new JLabel();
		label1.setText("당신이 생각한 숫자를 입력하세요.");
		JTextField text1 = new JTextField(10);
		
		
		JButton b1 = new JButton();
		b1.setText("숫자를 맞혀보자!");
		Font font = new Font("궁서", 1, 20); // 두번째를 1로 하면 글씨 진하게 됨.
		Font font2 = new Font("궁서", 1, 30); // 두번째를 1로 하면 글씨 진하게 됨.
		label1.setFont(font);
		text1.setFont(font2);
		b1.setFont(font);
		
		// f.setBackground(Color.green); 컬러가 먹히지 않음. 눈에 안 보이는 판대기가 안에 들어있기 때문
		f.getContentPane().setBackground(Color.green);
		text1.setBackground(Color.pink);
		text1.setForeground(Color.blue);
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.black);
		

		f.add(label1);
		f.add(text1);
		f.add(b1);
		
		f.setVisible(true);
		
	}

}
