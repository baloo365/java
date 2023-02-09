package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 케이팝인기투표 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.setSize(300, 700);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel label1 = new JLabel();
		label1.setText("K-pop 인기 투표");
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		ImageIcon icon1 = new ImageIcon("iu.jpg");
		b1.setIcon(icon1);
		ImageIcon icon2 = new ImageIcon("bts.jpg");
		b2.setIcon(icon2);
		ImageIcon icon3 = new ImageIcon("nj.jpg");
		b3.setIcon(icon3);

		JLabel label2 = new JLabel();
		label2.setText("1. 아이유-");
		
		JLabel label3 = new JLabel();
		label3.setText("2. BTS-");

		JLabel label4 = new JLabel();
		label4.setText("3. 뉴진스-");
		
		JLabel label22 = new JLabel();
		label22.setText("표");
		
		JLabel label33 = new JLabel();
		label33.setText("표");

		JLabel label44 = new JLabel();
		label44.setText("표");
		
		Font font1 = new Font("굴림", 1, 30);
		label1.setFont(font1);
		Font font2 = new Font("굴림", 1, 20);
		label2.setFont(font2);
		label3.setFont(font2);
		label4.setFont(font2);
		Font font3 = new Font("굴림", 1, 20);
		label22.setFont(font3);
		label33.setFont(font3);
		label44.setFont(font3);
		
		label22.setForeground(Color.red);
		label33.setForeground(Color.red);
		label44.setForeground(Color.red);
		
		
			b1.addActionListener(new ActionListener() {
				int iu = 0;
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
						iu++;
					
					label22.setText(iu+ "표");}
					
				
			});
		
			b2.addActionListener(new ActionListener() {
				int bts = 0;
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
					
						
								bts++;
							
							label33.setText(bts+ "표");}
							
						
					});
		
			b3.addActionListener(new ActionListener() {
				int nj = 0; // 버튼을 눌렀을 때 e안에 있는 내용이 실행됨.
				// e 안에다가 작성하게 되면 눌렀을 때마다 0으로 초기화되기 때문에 밖으로 빼야한다.
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
			
					
						nj++;
					
					label44.setText(nj+ "표");
				}
			});

		
		
		f.add(label1);
		f.add(b1);
		f.add(label2);
		f.add(label22);
		f.add(b2);
		f.add(label3);
		f.add(label33);
		f.add(b3);
		f.add(label4);
		f.add(label44);
		
		f.setVisible(true);
	}

}
