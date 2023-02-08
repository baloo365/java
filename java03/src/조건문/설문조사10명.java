package 조건문;

import javax.swing.JOptionPane;

public class 설문조사10명 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10명에게 배부른가요?? 물어봐서
		// 배부르다고 한 사람, 안 부르다고 한 사람 몇 명 카운트
		int full = 0; // 배부른 사람
		int nofull = 0; // 배 안 부른 사람

		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("배부른가요? 1) 배부름 2)배 안 부름");
			
			if (data.equals("1")) {
				full++; // full = full + 1 = 0 + 1 ; 와 동일
			} else if (data.equals("2")) {
				nofull++;
			}
			System.out.println("배부른 사람 몇명? " + full + "명");
			System.out.println("안 배부른 사람 몇명? " + full + "명");
		}
	}

}
