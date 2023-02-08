package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 숫자 누적
		//5부터 300까지 5의 배수만 모두 더해 출력해보세요.!
		
		int sum = 0;
		for (int i = 0; i <= 300; i++) {
			if (i%5==0) {
				sum = sum + i;
			}
		}
			System.out.println(sum);
		
		
		//2. 문자누적
		
		String sum2 = "";
		for (int i = 0; i < 4; i++) {
			String data = JOptionPane.showInputDialog("먹고 싶은 음식을 입력해주세요!");
			sum2 = sum2 + data + " ";
		}
		System.out.println(sum2);
	}

}
