package 상속;

public class 딸 {

		static int fWallet = 10000;
		static int count;
		String name;
		String gender;
		
		
		
		public 딸(String name, String gender) {
			count++;
			fWallet -= 1000;
			this.name = name;
			this.gender = gender;
		}

		

		@Override
		public String toString() {
			return "딸 [name=" + name + ", gender=" + gender + "]";
		}



		public void tv보다() {
			System.out.println("편안하게 재밌는 예능 프로그램을 보다.");
		}
	
	
		
	
	
	
}
