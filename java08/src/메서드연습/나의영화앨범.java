package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//코드 정리: 컨트롤 + 쉬프트 + f
public class 나의영화앨범 {

	static int index = 2; // 전역변수, 현재 2부터 시작

	public static void main(String[] args) { // static에서는 그냥 전역변수 접근x static 전역변수는 접근 가능
		String[] title = { "해리 포터와 마법사의 돌", "해리 포터와 비밀의 방", "해리 포터와 아즈카반의 죄수", "해리 포터와 불의 잔", "해리 포터와 불사조 기사단",
				"해리 포터와 혼혈 왕자", "해리 포터와 죽음의 성물 1편", "해리 포터와 죽음의 성물 2편" };
		String[] img = { "h1.jpg", "h2.jpg", "h3.jpg", "h4.jpg", "h5.jpg", "h6.jpg", "h7.jpg", "h8.jpg" };
		double[] jumsu = { 9.40, 8.90, 9.79, 9.41, 8.36, 6.98, 8.21, 9.33 };

		JFrame f = new JFrame();
		f.setSize(540, 580);
		f.getContentPane().setBackground(Color.green);

		Font font = new Font("궁서", Font.BOLD, 40); // 객체생성을 하는데, 특정한 입력값을 넣지 않으면 안 만들어질 수 있음.
		Font font2 = new Font("궁서", Font.BOLD, 30);

		// 배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 셋팅
		// BorderLayout
		JLabel top = new JLabel(title[2]);
		top.setHorizontalAlignment(0);
		top.setFont(font2);
		f.add(top, BorderLayout.NORTH);
		top.setForeground(Color.red);
		

		JLabel center = new JLabel("포스터");
		center.setFont(font);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);

		JLabel under = new JLabel(String.valueOf(jumsu[2])); // 정수를 문자로 바꿔줌.
		under.setHorizontalAlignment(0);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);
		under.setBackground(Color.blue);

		JButton left = new JButton("왼  쪽");
		left.setBackground(Color.pink);
		left.setFont(font2);
		f.add(left, BorderLayout.WEST);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 현재 인덱스보다 하나 적은 값들로 top, center, under 변경해주세요.

				if (index > 0) {
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(jumsu[index - 1] + "");
					index--;
				}else {
					JOptionPane.showMessageDialog(f, "여기가 왼쪽 끝입니다.");
				}
			}
		});

		// 액션처리 하는 방법
		// 1)액션기능을 add
		// 2)클릭액션이 있을 때 처리할 부품을 만들어주세요.
		// 3)클릭액션이 있을 때 어떻게 처리할지 내용을 코딩해주세요.
		JButton right = new JButton("오른쪽");
		right.setBackground(Color.pink);
		right.setFont(font2);
		f.add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 현재 인덱스보다 하나 적은 값들로 top, center, under 변경해주세요.

				if (index < 7) {
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(jumsu[index + 1] + "");
					index++;
				}else {
					JOptionPane.showMessageDialog(f, "여기가 오른쪽 끝입니다.");
				}
			}
		});

		f.setVisible(true);

	}

}
