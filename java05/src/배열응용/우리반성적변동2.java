package 배열응용;

import java.util.Random;

public class 우리반성적변동2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(42);

		int[] n1 = new int[10000];
		int[] n2 = new int[10000];
		
		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
	
		}
		int count = 0; // 동일한 개수 누적
		int count2 = 0; // 동일하지 않은 개수 누적
		
		for (int i = 0; i < n2.length; i++) {
			if (n1[i] == n2[i]) {
				count++;
			}else {
				count2++;
			}
		}
		
		System.out.println("동일한 개수: " + count + "\n" + "동일하지 않은 개수: " + count2);
		
		//2학기에 성적이 더 오른 학생은 몇명?? 누구??
		
		int count3 = 0;
		for (int i = 0; i < n2.length; i++) {
			if (n2[i] > n1[i]) {
				count3++;}
				System.out.println("성적이 오른 학생 : " + i);
		}
		//1학기 성적이 더 좋았던 학생은 몇명?? 누구??
		int count4 = 0;
		for (int i = 0; i < n2.length; i++) {
			if (n1[i] > n2[i]) {
				count4++;}
				System.out.println("1학기 성적이 더 좋은 학생 : " + i);
		}
		System.out.println("성적이 오른 학생 수: " + count3 + "\n" + "1학기 성적이 더 좋은 학생 : " + count4);
	}

}
