package 생성자;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {

			static int count;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				JFrame f = new JFrame();
				f.setSize(300, 300);
				f.setTitle("나의 카운터 프로그램");
				FlowLayout flow = new FlowLayout();
				f.setLayout(flow);
				
				JButton b1 = new JButton("1더하기");
				b1.setBackground(Color.green);
						
					
				JButton b2 = new JButton("0으로 초기화");
				b2.setBackground(Color.blue);
				b2.setForeground(Color.white);
				
				
				JButton b3 = new JButton("1빼기");
				b3.setBackground(Color.green);
				
				JLabel result = new JLabel();
				result.setText("0");
				result.setForeground(Color.red);
				Font font = new Font("궁서", 1, 100);
				
				result.setFont(font);
				
				b1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						count++;
						result.setText(count + "");
						
					}
				});
				
				b2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						count = 0;
						result.setText(count + "");
						
					}
				});
					
				b3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						count--;
						result.setText(count + "");
						
					}
				});
						
				f.add(b1);
				f.add(b2);
				f.add(b3);
				f.add(result);
				
				f.setVisible(true);
				
				
	}

}
