package 반복문;

public class for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3번 반복
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "내가 반복1");
		}
		
		// 100번 반복 --> 내가 반복2
		for (int i = 0; i < 100; i++) {
			System.out.println("내가 반복2>>" + i);
		}
		// 10번 반복 --> 내가 반복3 >> 1번쨰 실행중
		for (int i = 0; i < 10; i++) {
			System.out.println("내가 반복3 >>" +(i+1));
		}
	}

}
