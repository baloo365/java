package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기1 {

	public static void main(String[] args) {
		// 자주 사용하지 않는 부품을 만들어보자.
		// 틀!!이 있어서 그 틀을 가지고 찍어서 필요한 부품을 만들어 cpu가 조립!
		// new: 틀을 가지고 찍어낼 때 사용
		// new JFrame()는 JFrame이라는 틀을 이용해서 부품을 찍어내라!
		// 만든 부품은 모두 다 ram에 저장되어야 한다.
		// f변수 만들어서 부품을 넣어주세요.
		// f에는 JFrame이 저장되어야 함.
		JFrame f = new JFrame(); // JFrame이 들어갈 변수 생성 -> JFrane(JFrame 변수타입) 틀을 가지고 찍는다.
		f.setSize(500, 150);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		JLabel text1 = new JLabel(); //글씨
		text1.setText("아이디");
		

		JTextField input1 = new JTextField(10); // 글자 넣는 곳
		JTextField input2 = new JTextField(10); // 글자 넣는 곳
		
		JButton b1 = new JButton(); // JButton부품 만들어내서 b1에 저장.
		b1.setText("나는 버튼 1");
		
		JLabel text2 = new JLabel(); //글씨
		text2.setText("패스워드");
		
		JButton b2 = new JButton(); // JButton부품 만들어내서 b1에 저장.
		b2.setText("나는 버튼 2");
		
	

		
		Font font = new Font("궁서", 1, 20);
		b1.setFont(font);
		text1.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		text2.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.red); //배경색
		b1.setForeground(Color.white); //버튼의 위색, 글자색
		b2.setBackground(Color.red); //배경색
		b2.setForeground(Color.white); //버튼의 위색, 글자색
		input1.setBackground(Color.red); //배경색
		input1.setForeground(Color.white); //버튼의 위색, 글자색
		input2.setBackground(Color.red); //배경색
		input2.setForeground(Color.white); //버튼의 위색, 글자색
		
		//007.png 파일명을 쓰면 java02프로젝트 바로 아래 있는 것으로 인식한다.
		ImageIcon icon = new ImageIcon("007.png");
		ImageIcon icon2 = new ImageIcon("008.jpg");
		
		b1.setIcon(icon);
		b2.setIcon(icon2);
		
		f.add(text1);
		f.add(input1);
		f.add(b1); // f야 버튼을 추가해줘
		f.add(text2);
		f.add(input2);
		f.add(b2);

		//보여주는 것은 맨 끝으로!!
				f.setVisible(true); // true 라고 하면 보여주고 false라고 하면 안 보여줌.
	}

}
