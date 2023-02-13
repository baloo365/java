package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬순위 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// 정렬을 할 떄는 Arrays\
		
		
			Random r = new Random(42);
			int[] jumsu = new int[10000];
			
			for (int i = 0; i < jumsu.length; i++) {
				jumsu[i] = r.nextInt(1000) + 1 ;}
				
				// 정렬(sort): 오름차순 (작--> 큰(오름차순))
				Arrays.sort(jumsu); // 망치처럼 사용하기 때문에 new 필요 없음
				// jumsu가 바뀌어버림(원본이 파괴)
				// 파괴형 함수
				
				//parseInt(n) ==> ram에 저장된 n이 변경된 건 아님(원본이 비파괴)
				//ram에서 가져온 것을 cpu가 바꾸는 것임.
				//비파괴형 함수이며, 비파괴형 함수가 더 많음.
				
				//상위 30%
				int sum = 0;
				for (int i = 7000; i < jumsu.length; i++) {
					sum += jumsu[i];
				}
				System.out.println("상위 30%의 평균: " + (sum / 3000.0));
				
				//하위 30%
				int sum1 = 0;
				for (int i = 0; i < 3000; i++) {
					sum1 += jumsu[i];
				}
				System.out.println("하위 30%의 평균: " + (sum1 / 3000.0));
				
				}
				
			}
		
	


