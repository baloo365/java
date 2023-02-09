package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		// 아무값이나 발생시키는 부품 ==> random
		
		Random r = new Random(); 
		// Random r = new Random(10); 씨앗값, seed 값
		// 가짜 랜덤한 만들어주는 부품
		// r.nextInt(45) -> 0~44
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(45)+1)); // 0~9
		}

	}

}
