package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <=10 ; i++) {
			// i가 8이 되면 for문 종료!!
			if (i==8) {
				break; // for문 종료, for문 아래에 있는 내용이 이어서 실행!!
				// System.exit(0); // 컴퓨터야 나가라는 뜻  // 0: 정상종료  0이 아니 다른 값: 비정상종료 
			}
			if (i%2 !=0) {//홀수!
				continue; // 이번 i만 for문 안의 내용을 실행하지 말아라!
			}
			System.out.println(i);
		}
		System.out.println("휴~for문 다 끝났다~~");
	}

}
