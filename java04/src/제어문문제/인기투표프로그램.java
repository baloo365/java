package 제어문문제;

import java.util.Scanner;

public class 인기투표프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int data = 0;
		int iu = 0;
		int bts = 0;
		int nj = 0;
		
		System.out.println("인기투표 시스템");
		System.out.println("===========");
		
		while (true) {
			System.out.print("1)아이유 2)방탄 3)뉴진수 4)종료 >> ");
			data = sc.nextInt();
			
			if (data == 4) {
				System.out.println("시스템을 종료합니다.");
				break; //
				
			} else if (data == 2) {
				bts++;
			} else if (data == 3) {
				nj++;
			} else if (data == 1) {
				iu++;
			} 
		}  
			System.out.println("------------");	
			System.out.println("아이유 " + iu + "표" );	
			System.out.println("방탄 " + bts + "표");	
			System.out.println("뉴진스 " + nj + "표");	
			System.out.println("------------");	
			
			sc.close();
	}

}
