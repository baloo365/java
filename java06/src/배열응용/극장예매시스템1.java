package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			JFrame f = new JFrame();
			f.setTitle("극장예매시스템");
			f.setSize(1000, 800);
			//JLabel title = new JLabel("극장예매");
			
			//f.add(title);
			
			f.getContentPane().setBackground(Color.green);
			//배치해주는 부품 - FlowLayout
			FlowLayout flow = new FlowLayout();
			f.setLayout(flow);//추가한 순서대로 f에 붙는다.
			
			//버튼 배열 많이 만들어서 집어 넣을 배열 생성
			
			Font font = new Font("궁서", Font.BOLD, 45);
			Font font1 = new Font("궁서", Font.BOLD, 25);
			//title.setFont(font);
			
			
			JLabel result = new JLabel("결과 보이는 곳");
			result.setFont(font);
			result.setForeground(Color.red);
			
			
			
			
			JButton[] btns = new JButton[101]; // 배열을 사용하면 반복문을 사용할 수 있다는 것이 장점
			//예약 여부를 저장하는 배열을 만들어줍시다.!!
			int[] seat = new int[btns.length]; // {0,0,0,0,0,0,0,0,0,0,0,0}
			// 각 자리에 저장된 값이 0이면 아직 예약 안되었음. 예약되면 1로 바꿈!
			
			for (int i = 0; i < btns.length; i++) {
				btns[i] = new JButton(i + ""); // jbutton() 안에 숫자를 넣을 수 없음. 문자열만 가능하기 때문에 공백을 넣어서 문자열로 바꿔준다.
				f.add(btns[i]);
				btns[i].setFont(font);
				btns[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
					
						// e.getActioncommand(); 클릭한 버튼의 글자를 가지고 와줌.
						String text = e.getActionCommand();
						System.out.println(text);
						int no = Integer.parseInt(text); // text 값은 버튼 글자인데 배열 인덱스랑 동일함.
						//이미 해당 좌석번호가 1로 저장되어있는지 확인하고, 1이 아니면 예약 가능!!
						
						if (seat[no] == 1) { // 이미 예약되어 1이 들어있음. 예약불가
							result.setText("이미 예약된 자리. 예약불가");
							result.setForeground(Color.blue);
						
						}else if (btns[no].equals("마감")) {
							result.setText("이미 예약된 자리. 예약불가");
							result.setForeground(Color.blue);
						}
						else {
							seat[no] = 1; // 예약좌석은 1로 변경!
							result.setText(text + "번 예약완료.");
							btns[no].setText("마감");
							btns[no].setFont(font1);
							btns[no].setForeground(Color.red);
							btns[no].setEnabled(false);
							
						}
						
						
						
					}
				});
			}
			
			
			
			
			
			
			
			f.add(result);
			
			JButton total = new JButton("전체 예약 내역");
			total.setBackground(Color.blue);
			total.setForeground(Color.yellow);
			total.setFont(font);
			f.add(total);
			
			total.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 내용 넣기
					// 배열에 몇개가 1인지 세어서 더해줌.
					// 영화예매 1장단 1만원, 결제금액 프린트.
					
					int count = 0;
					for (int i = 0; i < btns.length; i++) {
						if (seat[i] == 1) {
							count++;;
						}
					}
					
					JOptionPane.showMessageDialog(f, "잔여 좌석은" + (btns.length-count) + "이고, 결제 금액은: " + (count * 10000) + "원입니다.");
				}
			});
			
			f.setVisible(true);
	}

}
