package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
				ArrayList me = new ArrayList();
				me.add(1000); //Object <-업캐스팅- Integer(클래스) <-오토박싱- int
				me.add(189.1); //Object <- Double(클래스) <- double
				me.add(false); //Object <- Boolean(클래스) <- boolean
				me.add('남'); //Object <- Character(클래스) <- char
				
				//ArrayList는 toString()가 재정의
				//list라는 참조형이기 때문에 list를 프린트하면 주소!가 프린트
				//toString()이 재정의한 내용은 주소가 가르키는 값들을 String으로 만들어주도록 정의함.
				//list를 찍어보면 주소대신 String으로 만든 내용이 출력
				System.out.println(me);
				
				//기본형일 경우만 연산자 사용 가능
				int money = (int)me.get(0) + 2000; // int <-오토언박싱- Integer <-다운캐스팅- Object
				System.out.println(money);
				
				
				double height = (double)me.get(1) + 10; // double <- Double <- Object
				System.out.println(height);
				
				boolean breakfast = (boolean)me.get(2); // boolean <- Boolean <- Object
				if (breakfast) {
					System.out.println("배불러요");
				}else {
					System.out.println("배고파요");
				}
				
				char gender = (char)me.get(3); // char <- Character <- Object
				if (gender == '남') {
					System.out.println("주민번호는 1,3이에요.");
				}else {
					System.out.println("주민번호는 2,4이에요.");
				}
				
				
				
						
				

	}

}
