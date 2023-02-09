package 복습;

import java.util.Scanner;

public class 제어문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값>> "); // 1,
		int start = sc.nextInt();
		System.out.print("종료값>> "); // 10, 2000
		int end = sc.nextInt();
		
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println("최종 더한 값은 " + sum);
		
		System.out.print("시작값>> "); // 1,
		int start2 = sc.nextInt();
		System.out.print("종료값>> "); // 10, 2000
		int end2 = sc.nextInt();
		System.out.print("점프값>> "); // 10, 2000
		int jump2 = sc.nextInt();
		
		int sum1 = 0;
		for (int i = start; i <=end; i= i+jump2) {
			sum1 = sum1 + i;
			
			if (sum1 >= 100) {
				System.exit(0);
			}
			
//			System.out.print("시작값>> "); //1, 1000
//			int start = sc.nextInt();
//			System.out.print("종료값>> "); //10, 2000
//			int end = sc.nextInt();
//			System.out.print("점프값>> "); //5
//			int jump = sc.nextInt();
//			int sum = 0;
//			for (int i = start; i <= end; i = i + jump) {
//				sum = sum + i;
//				if (sum >= 100) {
//					System.exit(0);	
		}
		
		System.out.println("최종 더한 값은 " + sum1);
		sc.close();
	}

}
