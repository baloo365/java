package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞히기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int data = 0;
		int target = 0;
		Random r = new Random();
		target = r.nextInt(50);
		
		int count = 0;
		while (true) {
			
			System.out.print("당신이 생각하는 정답은?");
			data = sc.nextInt();
			count++;
			if (data == target) {
				System.out.println("정답입니다.");
				System.out.println("당신의 시도 횟수는 " + count);
				System.out.println("프로그램을 종료합니다..");
				break;
			} else {
				System.out.println("오답입니다.");
				System.out.println("다시 시도해주세요.");
				if (data > target) {
					System.out.println("입력한 값이 타겟값보다 큽니다.");
				} else {
					System.out.println("입력한 값"
							+ "이 타겟값보다 작습니다.");
				}
				
			} 
			// System.out.println("전체 시도 횟수"+);
		}
		sc.close();
		
	}

}
