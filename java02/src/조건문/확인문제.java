package 조건문;

import javax.swing.JOptionPane;

public class 확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pw = JOptionPane.showInputDialog("암호를 대시오");
		String pw2 = "pass";
		if (pw.equals(pw2)) {
			System.out.println("들어오세요.");
		}
		else {
			System.out.println("나가세요.");
		}
		
		String food = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는?(자장면, 라면, 회에서 선택)");
		if (food.equals("자장면")) {
			System.out.println("중국집으로 가요.");
		}
		else if (food.equals("라면")) {
			System.out.println("분식집으로 가요.");
		}
		else if (food.equals("회")) {
			System.out.println("횟집으로 가요.");
		}
		else {
			System.out.println("그냥 안 먹어요.");
		}
		
		String x = JOptionPane.showInputDialog("정수를 입력하세요.");
		String y = JOptionPane.showInputDialog("정수를 입력하세요.");
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		
		if (x1 > y1) {
			System.out.println("처음에 입력한 값인 " + x1 + "이 더 큽니다.");
		}
		else if (x1 < y1) {
			System.out.println("두번째로 입력한 값인 " + y1 + "이 더 큽니다.");
		} 
		else {
			System.out.println("두 값이 같습니다.");
		}
		
		String no = "A100EX";
		char alphabet = no.charAt(0);
				switch (alphabet) {
				case 'A':
					System.out.println("기획부");
					break;
				case 'B':
					System.out.println("총무부");
					break;
				case 'C':
					System.out.println("개발부");
					break;
				default:
					System.out.println("해당부서없음");
					break;
				}
		
		
	}

}
