package 배열응용;

import java.util.Scanner;

public class 입력받아배열넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String[] data1 = new String[3];
		String[] data2 = new String[3];
		
		for (int i = 0; i < data1.length; i++) {
			System.out.print("작년에 가고 싶었던 곳 세 곳을 기재해주세요.>> ");
			data1[i] = sc.next();
		}
		
		for (int i = 0; i < data1.length; i++) {
			System.out.print("올해에 가고 싶은 곳 세 곳을 기재해주세요.>> ");
			data2[i] = sc.next();
		}
		
		int count = 0;
		for (int i = 0; i < data2.length; i++) {
			if (data1[i].equals(data2[i])) {
				count++;
			}
		}
		System.out.println("작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳은 총: " + count + "곳");
		
	}

}
