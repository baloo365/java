package 배열응용;

import java.util.Scanner;

public class scanner배열응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < data.length; i++) {
			System.out.print("정수를 입력하세요>> ");
			data[i] = sc.nextInt();
		}
		System.out.println(data[0] + data[2]);
		
		
		String[] data2 = new String[3];
		for (int i = 0; i < data2.length; i++) {
			System.out.print("자바, 스프링, JSP를 순서대로 하나씩 입력하세요.>> ");
			data2[i] = sc.next();
		}
		System.out.println(data2[0] + " 보다는 " + data2[1]);
		
		
		sc.close();
	}

}
