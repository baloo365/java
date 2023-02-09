package 배열;

import java.lang.reflect.Array;

public class 배열개념 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 여러개의 데이터를 램에 저장해두고 cpu가 접근하여 사용하고 싶은 경우 사용하는 부품
		// 1. 값을 이미 알고 있는 경우
		int[] jumsu = {10, 20, 30, 40}; // length만들어서 몇개인지 세서 값을 넣어줌.
		System.out.println(jumsu);
		System.out.println(jumsu[0]);//첫번째값
		System.out.println(jumsu[1]);//두번째값
		System.out.println(jumsu[2]);//세번째값
		System.out.println(jumsu[3]);//네번째값
		System.out.println("전체 개수: " + jumsu.length); //이 주소가 가르키는 length변수
		
		int[] week = {8, 9, 9, 10, 12, 5, 5};
		System.out.println(week[0]);
		System.out.println(week[1]);
		System.out.println(week.length);
		week[2] = 10;
		week[4] = 12;
		System.out.println(week[2]);
		System.out.println(week[4]);
		
		// 2. 값을 아직 모르고 있는데, 먼저 저장공간 만들어두고 나중에 값을 넣는 경우
		int[] tour = new int[4];
		tour[1] = 20;
		tour[3] = 30;
		System.out.println(tour[1]);
		System.out.println(tour[3]);
		System.out.println(tour.length);
	
	}

}
