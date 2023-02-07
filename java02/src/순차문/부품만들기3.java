package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		f.setSize(500, 100);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel label1 = new JLabel();
		ImageIcon icon1 = new ImageIcon("009.jpg");
		label1.setIcon(icon1);
		
		JLabel label2 = new JLabel();
		label2.setText("숫자1");
		JLabel label3 = new JLabel();
		label3.setText("숫자2");
		
		JTextField input1 = new JTextField(10); // 글자 넣는 곳
		JTextField input2 = new JTextField(10); // 글자 넣는 곳
		
		JButton b1 = new JButton();
		b1.setText("+");
		JButton b2 = new JButton();
		b2.setText("-");
		JButton b3 = new JButton();
		b3.setText("*");
		JButton b4 = new JButton();
		b4.setText("/");
		
		Font font = new Font("굴림", 1, 40);
		label2.setFont(font);
		label3.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		input2.setBackground(Color.yellow);
		input1.setBackground(Color.yellow);
		label2.setForeground(Color.blue);
		label3.setForeground(Color.blue);
		input1.setForeground(Color.green);
		input2.setForeground(Color.green);
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);
		b4.setForeground(Color.white);
		b1.setBackground(Color.blue);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.blue);
		b4.setBackground(Color.blue);
		
		
		f.add(label1);
		f.add(label2);
		f.add(input1);
		f.add(label3);
		f.add(input2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		
		f.setVisible(true);
	}
	
		

}
