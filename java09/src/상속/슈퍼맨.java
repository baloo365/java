package 상속;

public class 슈퍼맨 extends 맨{ //맨을 상속받음

		boolean fly;
		
		public void space() {
			sleep();
			System.out.println("이름은 " + name);
			System.out.println("우주를 날다.");
		}

		@Override
			public void eat() {
			// 사람이라는 부모 클래스가 가지고 있던 것 // 많이 먹다로 재정의됨.
					System.out.println("많이 먹다");
		} 
		
		
		@Override
		public String toString() {
			return "슈퍼맨 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
		}
	
		
}
