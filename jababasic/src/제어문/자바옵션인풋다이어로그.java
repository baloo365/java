package 제어문;

import javax.swing.JOptionPane;

public class 자바옵션인풋다이어로그 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("당신의 이름은?");
		String result = "나의 이름은 " + name + "입니다.";
		System.out.println(result);
	}

}
