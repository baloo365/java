package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("신장을 입력하세요.");
		String data2 = JOptionPane.showInputDialog("몸무게를 입력하세요.");
		
		double data11 = Double.parseDouble(data1);
		double data22 = Double.parseDouble(data2);
		
		double bmi = (data11 - data22)*0.9 ;
		//System.out.println(bmi);
		JOptionPane.showMessageDialog(null, bmi);
	}

}
