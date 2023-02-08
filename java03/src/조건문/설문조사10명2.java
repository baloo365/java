package 조건문;

import javax.swing.JOptionPane;

public class 설문조사10명2 {

	public static void main(String[] args) {
		// 인기투표해봅시다.!!
		// 1) 아이유 2) 뉴진스 3) BTS
		
		int iu = 0;
		int newjeans = 0;
		int bts = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("투표해주세요! 1)아이유 2)뉴진스 3)BTS");
			if (data.equals("1")) {
				iu++;
			}else if (data.equals("2")) {
				newjeans++;
			}else if (data.equals("3")) {
				bts++;
			}
			
		
		}
		
		System.out.println("아이유 몇 표? " + iu + "표");
		System.out.println("뉴진스 몇 표? " + newjeans + "표");	
		System.out.println("BTS 몇 표? " + bts + "표");	
		
		
	}

}
