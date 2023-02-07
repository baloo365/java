package 조건문;

import javax.swing.JOptionPane;

public class 확인문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = JOptionPane.showInputDialog("계산할 수1을 입력하세요.");
		String y = JOptionPane.showInputDialog("계산할 수2를 입력하세요.");
		String z = JOptionPane.showInputDialog("사칙연산자를 입력하세요.(*, +, -, / 중에서 선택)");
		double x1 = Double.parseDouble(x);
		double y1 = Double.parseDouble(y);
		
		double result = 0;
		
		switch (z) {
		case "*":
			result = x1*y1;
			break;
		case "+":
			result = x1+y1;
			break;
		case "-":
			result = x1-y1;
			break;
		case "/":
			result = x1/y1;
			break;
		}
		System.out.println(result);
		
		//  두 수를 입력받아 정수로 변환하여 정수변수에  저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!
		
		String a = JOptionPane.showInputDialog("계산할 수1을 입력하세요.");
		String b = JOptionPane.showInputDialog("계산할 수2를 입력하세요.");
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		
		double result2 = a1/(double)b1 ;
		System.out.printf("%.2f",result2);
	}

}
