package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] jumsu2 = new int[1000];
		
		Random r = new Random(42);
		int count = 0;
		int sum = 0;
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19)+2; // 2~20
		}
		
		// 전체 프린트
		for (int x : jumsu2) {
				System.out.println(x);
		}
			
			
		for (int i = 0; i < jumsu2.length; i++) {
				if (jumsu2[i] >= 15) {
					count = count + 1; // count++
					sum = sum + jumsu2[i];
		}	
		}
		System.out.println("15 이상인 숫자의 개수는 " + count + "개");
		System.out.println("15 이상인 숫자의 합 " + sum  + "개");
	
		
	
			
	}

}
