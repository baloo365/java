package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두개의 숫자를 입력을 받아서 처리해서 출력
		String n1 = JOptionPane.showInputDialog("숫자1 입력");
		String n2 = JOptionPane.showInputDialog("숫자2 입력");
		
		//정수로 바꾸어주는 부품을 써서 처리를 해야 함.
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		// 출력
		System.out.printf("%.3f",(double)n11 / n22);
		//값은 이미 정수로 ram에 저장이 되었으니, 계산할 때 cpu가 강제로 실수로 바꿔서 계산
		
	}

}
