package 제어문;

import javax.swing.JOptionPane;

public class 확인문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String data2 = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		String result = "오늘 " + data1 + "에 수업후 나는 " + data2 + "할 예정";
				System.out.println(result);
		
				int num1 = 30;
				int num2 = 40;
				double result1 = (1.0*num1) /num2;
				
				System.out.println(num1 + num2);
				System.out.println(result1);
				System.out.println(num1%num2);
		
				double x = 33.3;
				double y = 22.2;
				System.out.println(x == 44.2);
				System.out.println(x == y);
				System.out.println(y > 55);
				
					int hour = 3;
					double length = 5.5;
					char first = 's';
					boolean joy = true;
					System.out.println(hour);
					System.out.println(length);
					System.out.println(first);
					System.out.println(joy);
					
					
				
	}

}
