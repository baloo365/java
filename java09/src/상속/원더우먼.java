package 상속;

public class 원더우먼 extends 우먼{

				int fast;
				
				
				public void fight() {
					System.out.println("상대를 제압하다.");
				}


				@Override
				public String toString() {
					return "원더우먼 [fast=" + fast + ", tall=" + tall + ", name=" + name + ", age=" + age + "]";
				}


				
				

}
