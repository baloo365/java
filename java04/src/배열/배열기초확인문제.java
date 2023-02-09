package 배열;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[] x = new int[5]; // 1번 // 전체 만들어지는 변수의 개수는 7개
			System.out.println(x.length); // 2번 // 배열의 크기, 배열의 길이, 배열의 사이즈는 5
			x[0] = 100; // 3번
			System.out.println(x[0]);
			x[4] = 500; // 4번
			System.out.println(x[4]);
			x[2] = 200; // 5번
			System.out.println(x[2]);
			
			//6번
			for (int i = 0; i < x.length; i++) {
				System.out.print(x[i] + " ");
			}
			//7번
			System.out.println();
			for (int i = 0; i < x.length; i++) {
				System.out.print( i+":" + x[i] + " ");
			}
	}

}
