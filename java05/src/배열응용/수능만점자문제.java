package 배열응용;

import java.util.Random;

public class 수능만점자문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수능 10000명의 점수를 처리!
		// 1) 만점자가 몇 명인지?
		// 2) 0점이 몇 명인지?
		// 3) 평균은 어떻게 되었는지?
		// 4) 평균보다 +- 50점인 학생
		Random r = new Random(42);
		
		int[] jumsu = new int[10000];
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451); // 0~450
		}
		
		//1~2번
		int man = 0;
		int zero = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 450) {
				man++;
				System.out.println("만점자는 몇 번째? " + i);
			}else if (jumsu[i] == 0) {
				zero++;
			}
		}
		System.out.println("만점자 수: " + man );
		System.out.println("0점자 수: " + zero );
		
		//3번
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}
		double avg = (double)sum / jumsu.length;
		System.out.println("평균은 몇인가? " + avg);
		
		//4번
		int count = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] <= avg+50 && jumsu[i] >= avg-50 ) {
				count++;
			}
		}
		System.out.println("평균보다 +-50점인 학생의 수 : " + count);
		
		//30% 범위에 있는 사람이 몇명인지, 그 사람들의 평균까지 프린트해보실래요. // 상위 30%
		// 3000번째로 점수가 높은 사람의 점수는?
		// 우선은 점수가 무작위로 배열에 저장되어 있음. 높은 순대로 정렬을 하든가. 앞뒤 점수를 비교해야할듯..?
		// 평균값을 구했더니 210이 나옴. 201점은 상위 몇프로?
		
		
	}

}
