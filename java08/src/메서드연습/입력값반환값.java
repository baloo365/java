package 메서드연습;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력값반환값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int data1 = r.nextInt(5); //0~4 에 해당하는 수를 만들어준다.
		String data2 = JOptionPane.showInputDialog("이름 입력"); //String으로 return
		JOptionPane.showMessageDialog(null, data2); //void이기 때문에 반환할 값이 없어서 변수가 필요없음.
		
	}

}
