package 부품사용하기;

import 부품만들기.전화기;

public class 전화기사용하기 {

	public static void main(String[] args) {
		// 전화기를 만들어보자. 2개를 만들어보자. jbutton 만드는 것과 동일.
		전화기 p1 = new 전화기();
		전화기 p2 = new 전화기();
		
		p1.price = 1000;
		p1.shape = "폴더";
		p1.인터넷하다();
		p1.카톡하다();
		 // 다른 패키지에서도 보이고 다 쓰고 싶으면 'public' 붙여줘야함. - 아무데서나(다른 패키지에서도) 접근 가능 설정(접근제어자)

		System.out.println("p1의 가격 : " +p1.price);
		System.out.println("p1의 가격 : " +p1.shape);
		
		
	}

}
