package 부품만들기;

import org.omg.CORBA.PUBLIC_MEMBER;

public class 전화기 {
	// new jbutton도 이런식으로 만들어져서 jdk4500 부품중 하나임.
	// 클래스는 멤버변수와 멤버메서드를 가지고 있음.
	// 성질: 멤버변수(가격, 모양)
		public int price; //맴버변수는 자동 초기화!! (0)
		public String shape; // 기본형이 아닌 경우(참조형)모두 null로 초기화됨.
	
	// 동작(동적인 기능 수행): 멤버메서드(함수와 동일)
	// 					인터넷하다, 카톡하다.
	public void 인터넷하다() {
		//기능 처리하는 방법을 나열 - 우선은 아직 그런 방법을 모르니 sysout 넣어두자.
		System.out.println("와이파이연결하다.");
		System.out.println("데이터를 써서 연결하다.");
		}
	
	public void 카톡하다() {
		System.out.println("자바 단체톡을 하다.");
		System.out.println("게시물을 올리다.");
	}
	
	
}
