package 반복문;

import java.util.Scanner;

public class 콘솔입력1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scanner
		Scanner sc = new Scanner(System.in); // 컴퓨터.키보드
		//자바프로그램과 콘솔간에 통로를 만든다.
		//연결통로 == 강물(스트림, Stream)
		//Stream은 내가 닫아주지 않으면 계속 가지고 있게 됨.
		//좋은 코드는 Stream을 반드시 닫아줌.
		System.out.println("요일 입력: 주중1) 주말2)");
		int data = sc.nextInt(); // string으로 입력을 받아서 int로 한꺼번에 바꾸는 기능이 있으면 좋을 것 같다
		// 그것이 바로 scanner sc.nextInt() // String --> int
		// sc.nextInt() ; String으로 int로 바꾸어주는 것까지 한꺼번에 해주기때문!!
		
		if (data == 1) {
			System.out.println("열심히 달리자.");
		}else {
			System.out.println("쉬자.");
		}
		sc.close();
	}

}
