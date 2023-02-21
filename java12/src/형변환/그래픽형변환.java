package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 그래픽형변환 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		// FlowLayout flow = new FlowLayout();
		f.setLayout(new FlowLayout());
		f.add(new JButton("나는 버튼")); //component <- JButtin(자동형변환)
		// 딱 한번 쓸 때 사용 // 변수를 안 만들면 .set 이런 거 못 함.
		f.add(new JLabel("나는 라벨"));
		f.add(new JTextField(10));
		
		f.setVisible(true);
	}

}
