package 반복문;

import java.util.Scanner;

public class 콘솔연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		System.out.println("나에 대한 정보");
		System.out.println("-------------");
		System.out.print("이름 입력>> "); // 프린트하고
		String name = sc.next(); // 입력받고
		System.out.print("키 입력>> "); // 프린트하고
		double height = sc.nextDouble(); // 입력받고
		System.out.print("몸무게 입력>> ");
		double weight = sc.nextDouble();
		System.out.print("저녁을 먹었나요(true/false)>> ");
		boolean food = sc.nextBoolean();
		System.out.print("올해의 목표는 ");
		// sc.nextLine(); // 엔터를 치며 생긴 공백 해결
		String life = sc.nextLine();
		
		
		System.out.println("===============");
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 키는 " + height + "입니다.");
		System.out.println("내 몸무게는 " + weight + "입니다.");
		System.out.println("저녁은 " + food + "입니다.");
		System.out.println("제 좌우명은 " + life + "입니다.");
		
		sc.close();
		
		
	}

}
