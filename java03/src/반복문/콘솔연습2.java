package 반복문;

import java.util.Scanner;

public class 콘솔연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = sc.next();
		System.out.print("패스워드: ");
		String pw = sc.next();
		
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		
		System.out.print("사과 구매 갯수: ");
		int apple_num = sc.nextInt();
		System.out.print("사과 한 개당 가격: ");
		int apple_price = sc.nextInt();
		System.out.print("딸기 구매 갯수: ");
		int berry_num = sc.nextInt();
		System.out.print("사과 한 개당 가격: ");
		int berry_price = sc.nextInt();
		
		int apple_total = apple_num * apple_price;
		int berry_total = berry_num * berry_price;
		int total = apple_total + berry_total;
		
		System.out.println("사과 구매 가격은 " + apple_total + "원입니다.");
		System.out.println("딸기 구매 가격은 " + berry_total + "원입니다.");
		System.out.println("전체 구매 가격은 " + total + "원입니다.");
		
		sc.close();
	}

}
