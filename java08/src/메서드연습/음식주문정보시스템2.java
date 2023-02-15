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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.soap.Text;

public class 음식주문정보시스템2 {
	
	//심화
	//1)버튼을 클릭했을 때, 각 음식의 주문량을 체클해서 f의 title로 보여주세요.!!
	//2)음식의 값을 다 분리, 짬뽕은 3500원 우동은 3000원 짜장은 4000원
	
	
	static int count; //0으로 초기화, 전역변수!
	static int countJjam; //0으로 초기화, 전역변수!
	static int countJja; //0으로 초기화, 전역변수!
	static int countUdong; //0으로 초기화, 전역변수!
	final static int Jjam = 3500; //final은 변경 불가한 상수이다.
	final static int Jja = 4000; //final은 변경 불가한 상수이다.
	final static int Udong = 5500; //final은 변경 불가한 상수이다.
	//상수 변수를 쓸 때는 잘 보이라고 변수명을 모두 대문자로! 쓰기를 권장!!
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] img = { "20230215-150854-001.png", "20230215-150913-001.png", "20230215-150928-001.png"};
			
			JFrame f = new JFrame();
			f.setSize(800, 1000);
			FlowLayout flow = new FlowLayout();
			f.setLayout(flow);
			
			
			Font font = new Font("굴림", 1, 40);
			
			JButton b1 = new JButton("짬뽕");
			f.add(b1);
			b1.setFont(font);
			b1.setBackground(Color.pink);
			
		
			JButton b2 = new JButton("짜장");
			f.add(b2);
			b2.setFont(font);
			b2.setBackground(Color.orange);
			
			JButton b3 = new JButton("우동");
			f.add(b3);
			b3.setFont(font);
			b3.setBackground(Color.cyan);
			
			JLabel label = new JLabel("총 개수: ");
	 		f.add(label);
	 		label.setFont(font);
	 		JTextField text = new JTextField(5);
	 		text.setBackground(Color.green);
	 		text.setText("개");
	 		text.setFont(font);
	 		f.add(text);
	 		text.setBackground(Color.yellow);
	 		
	 		JLabel label2 = new JLabel();
			ImageIcon icon = new ImageIcon(img[0]);
			label2.setIcon(icon);
			f.add(label2);
			
			JTextArea label3 = new JTextArea("총 결제 금액은");
			f.add(label3);
	 		label3.setFont(font);
			
	 		
	 		b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(img[1]);
				label2.setIcon(icon);
					
					countJjam++;
					count++;
					f.setTitle("짬뽕 개수: " + countJjam + ", 짜짱 개수: " + countJja + ", 우동 개수: " + countUdong );
					text.setText(count+ "개");
					label3.setText("짬뽕 " + countJjam + "개 " + (countJjam * Jjam) + "원" + "\n" + "짜장 " + countJja + "개 " + (countJja * Jja) + "원" +  "\n" + "우동 " + countUdong + "개 " + (countUdong * Udong) + "원" +  "\n" + "총 결제 금액: "+((countJjam * Jjam)+ (countJja * Jja) + (countUdong * Udong))+ "원입니다.");
				}
			});
			
	 		b2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(img[0]);
				label2.setIcon(icon);
					
					countJja++;
					count++;
					f.setTitle("짬뽕 개수: " + countJjam + ", 짜짱 개수: " + countJja + ", 우동 개수: " + countUdong );
					text.setText(count + "개");
					label3.setText("짬뽕 " + countJjam + "개 " + (countJjam * Jjam) + "원" + "\n" + "짜장 " + countJja + "개 " + (countJja * Jja) + "원" +  "\n" + "우동 " + countUdong + "개 " + (countUdong * Udong) + "원" +  "\n" + "총 결제 금액: "+((countJjam * Jjam)+ (countJja * Jja) + (countUdong * Udong))+ "원입니다.");
				}
			});
	 		
	 		b3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(img[2]);
				label2.setIcon(icon);
					
					countUdong++;
					count++;
					f.setTitle("짬뽕 개수: " + countJjam + ", 짜짱 개수: " + countJja + ", 우동 개수: " + countUdong );
					text.setText(count + "개");
					label3.setText("짬뽕 " + countJjam + "개 " + (countJjam * Jjam) + "원" + "\n" + "짜장 " + countJja + "개 " + (countJja * Jja) + "원" +  "\n" + "우동 " + countUdong + "개 " + (countUdong * Udong) + "원" +  "\n" + "총 결제 금액: "+((countJjam * Jjam)+ (countJja * Jja) + (countUdong * Udong))+ "원입니다.");
				}
			});
	 		
			
	
			
			
			f.setVisible(true);
					
		
	}

}
