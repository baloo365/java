package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.xml.soap.Text;

public class 음식주문정보시스템 {

	
	static int count; //0으로 초기화, 전역변수!
	final static int PRICE = 5000; //final은 변경 불가한 상수이다.
	//상수 변수를 쓸 때는 잘 보이라고 변수명을 모두 대문자로! 쓰기를 권장!!
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] img = { "20230215-150854-001.png", "20230215-150913-001.png", "20230215-150928-001.png"};
			
			JFrame f = new JFrame();
			f.setSize(700, 600);
			FlowLayout flow = new FlowLayout();
			f.setLayout(flow);
			
			
			Font font = new Font("굴림", 1, 40);
			
			JButton b1 = new JButton("짬뽕");
			f.add(b1);
			b1.setFont(font);
			
		
			JButton b2 = new JButton("짜장");
			f.add(b2);
			b2.setFont(font);
			
			JButton b3 = new JButton("우동");
			f.add(b3);
			b3.setFont(font);
			
			JLabel label = new JLabel("개수: ");
	 		f.add(label);
	 		label.setFont(font);
	 		JTextField text = new JTextField(5);
	 		text.setBackground(Color.green);
	 		text.setText("개");
	 		text.setFont(font);
	 		f.add(text);
	 		
	 		JLabel label2 = new JLabel();
			ImageIcon icon = new ImageIcon(img[0]);
			label2.setIcon(icon);
			f.add(label2);
			
			JLabel label3 = new JLabel("총 결제 금액은: ");
			f.add(label3);
	 		label3.setFont(font);
			
	 		
	 		b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(img[1]);
				label2.setIcon(icon);
					
					count++;
					System.out.println(count);
					text.setText(count+ "개");
					label3.setText("결제 금액: "+(count * PRICE)  + "원입니다.");
				}
			});
			
	 		b2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(img[0]);
				label2.setIcon(icon);
					
					count++;
					System.out.println(count);
					text.setText(count + "개");
					label3.setText("결제 금액: " +(count * PRICE) + "원입니다.");
				}
			});
	 		
	 		b3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(img[2]);
				label2.setIcon(icon);
					
					count++;
					System.out.println(count);
					text.setText(count + "개");
					label3.setText("결제 금액: " +(count * PRICE)  + "원입니다.");
				}
			});
	 		
			
	
			
			
			f.setVisible(true);
					
		
	}

}
