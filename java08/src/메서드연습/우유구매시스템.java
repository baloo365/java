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

public class 우유구매시스템 {
	
	//심화
	//1)버튼을 클릭했을 때, 각 음식의 주문량을 체클해서 f의 title로 보여주세요.!!
	//2)음식의 값을 다 분리, 짬뽕은 3500원 우동은 3000원 짜장은 4000원
	
	static int result;
	static int count; //0으로 초기화, 전역변수!
	static int countberry; //0으로 초기화, 전역변수!
	static int countchoco; //0으로 초기화, 전역변수!
	static int countcoffee; //0으로 초기화, 전역변수!
	final static int berry = 1000; //final은 변경 불가한 상수이다.
	final static int choco = 1000; //final은 변경 불가한 상수이다.
	final static int coffee = 1000; //final은 변경 불가한 상수이다.
	//상수 변수를 쓸 때는 잘 보이라고 변수명을 모두 대문자로! 쓰기를 권장!!
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] img = { "02.jpg", "01.jpg", "03.jpg"};
			
			JFrame f = new JFrame();
			f.setSize(750, 800);
			FlowLayout flow = new FlowLayout();
			f.setLayout(flow);
			
			
			Font font = new Font("굴림", 1, 40);
			
			JButton b1 = new JButton("딸기우유");
			f.add(b1);
			b1.setFont(font);
			b1.setBackground(Color.pink);
			
		
			JButton b2 = new JButton("초코우유");
			f.add(b2);
			b2.setFont(font);
			b2.setBackground(Color.orange);
			
			JButton b3 = new JButton("커피우유");
			f.add(b3);
			b3.setFont(font);
			b3.setBackground(Color.cyan);
			
			JLabel label = new JLabel("총 개수: ");
	 		f.add(label);
	 		label.setFont(font);
	 		JTextField text = new JTextField(10);
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
	 		
	 		JButton b4 = new JButton("만원 이상 구매시 천원 할인 적용");
			f.add(b4);
			b4.setFont(font);
			b4.setBackground(Color.red);
			
			
	 		
	 		b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(img[1]);
				label2.setIcon(icon);
					
					countberry++;
					count++;
					f.setTitle("딸기우유 개수: " + countberry + ", 초코우유 개수: " + countchoco + ", 커피우유 개수: " + countcoffee );
					text.setText(count+ "개");
					label3.setText("딸기우유 " + countberry + "개 " + (countberry * berry) + "원" + "\n" + "초코우유 " + countchoco + "개 " + (countchoco * choco) + "원" +  "\n" + "커피우유 " + countcoffee + "개 " + (countcoffee * coffee) + "원" +  "\n" + "총 결제 금액: "+((countberry * berry)+ (countchoco * choco) + (countcoffee * coffee))+ "원입니다.");
					result = ((countberry * berry)+ (countchoco * choco) + (countcoffee * coffee));
				}
			});
			
	 		b2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(img[0]);
				label2.setIcon(icon);
					
				countchoco++;
				count++;
				f.setTitle("딸기우유 개수: " + countberry + ", 초코우유 개수: " + countchoco + ", 커피우유 개수: " + countcoffee );
				text.setText(count+ "개");
				label3.setText("딸기우유 " + countberry + "개 " + (countberry * berry) + "원" + "\n" + "초코우유 " + countchoco + "개 " + (countchoco * choco) + "원" +  "\n" + "커피우유 " + countcoffee + "개 " + (countcoffee * coffee) + "원" +  "\n" + "총 결제 금액: "+((countberry * berry)+ (countchoco * choco) + (countcoffee * coffee))+ "원입니다.");
				result = ((countberry * berry)+ (countchoco * choco) + (countcoffee * coffee));
			}
		});
		
	 		
	 		b3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(img[2]);
				label2.setIcon(icon);
					
				countcoffee++;
				count++;
				f.setTitle("딸기우유 개수: " + countberry + ", 초코우유 개수: " + countchoco + ", 커피우유 개수: " + countcoffee );
				text.setText(count+ "개");
				label3.setText("딸기우유 " + countberry + "개 " + (countberry * berry) + "원" + "\n" + "초코우유 " + countchoco + "개 " + (countchoco * choco) + "원" +  "\n" + "커피우유 " + countcoffee + "개 " + (countcoffee * coffee) + "원" +  "\n" + "총 결제 금액: "+((countberry * berry)+ (countchoco * choco) + (countcoffee * coffee))+ "원입니다.");
				result = ((countberry * berry)+ (countchoco * choco) + (countcoffee * coffee));
			}
		});
	 		
	 		System.out.println(result);
	 		
	 		
	 		JLabel label4 = new JLabel("");
	 		f.add(label4);
	 		label4.setFont(font);
	 		
	 			b4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				
					if (result > 10000) {
						result = result - 1000;
						label4.setText("1000원 할인되어 총 " + result + "원입니다.");
					}
					
					
				}
	 			});
			
			
	
			
			
			f.setVisible(true);
					
		
	}

}
