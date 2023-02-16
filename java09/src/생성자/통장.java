package 생성자;

public class 통장 {

			String name; // 이름
			String ssn; // 주민번호
			int money;// 돈
			
			
			
			// 꼭 이 변수를 넣어야지만 객체를 생성하고 싶어▽▽ // 상황에 따라 이름, 주민번호, 돈 모두 필요없고 한두개 정도만 필요하면 필요한 피라미터만 가지고도 생성자 만들어도 됨.
			public 통장(String name, String ssn, int money) {
				super();
				this.name = name;
				this.ssn = ssn;
				this.money = money;
				
				
			}



			@Override
			public String toString() { 
				//toString()이 써있는 경우
				//sysout(여행통장)하면 그 주소가 아니라 그 멤버변수가 가르키는 값들을 프린트!!
				//String으로 만들어서 return 해줌
				return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
			}
			
			
			
			
			
}
