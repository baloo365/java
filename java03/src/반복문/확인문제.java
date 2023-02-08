package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 JFrame f = new JFrame(); 
		 f.setSize(500, 300); 
		 FlowLayout flow = new FlowLayout(); 
		 f.setLayout(flow);
		 
		 JButton b1 = new JButton(); 
		 b1.setText("별 10개"); 
		 JButton b2 = new JButton();
		 b2.setText("커피*5"); 
		 JButton b3 = new JButton(); 
		 b3.setText("커피*우유 3개");
		 JButton b4 = new JButton(); 
		 b4.setText("1: 짱");
		 
		  Font font = new Font("굴림", 1, 20); 
		  b1.setFont(font);
		  b2.setFont(font);
		  b3.setFont(font);
		  b4.setFont(font);
		  
		  f.getContentPane().setBackground(Color.yellow);
		  
		  f.add(b1);
		  f.add(b2);
		  f.add(b3);
		  f.add(b4);

		  
		  //1)버튼에다가 액션기능을 추가하겠다고 설정
		  //2)클릭액션이 있을때 어떤 부품이 액션처리를 어떻게 할지 코딩해주세요.
		  b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 클릭했을 때 처리 내용을 여기에 써라.
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}

			}
		});
		  
		  b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				System.out.println();
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
			}
		});
		  
		  b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println();
					 for (int i = 0; i < 5; i++) {
							System.out.println("커피*우유");
					}
				}
			});
		  
		  b4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					for (int i = 0; i < 3; i++) {
						System.out.println((i + 1) + " : 짱!");
					}
				}
			});

		
		 
		f.setVisible(true);

		

	}

}
