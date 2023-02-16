package 생성자;

public class 은행통장사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				통장 여행통장 = new 통장("홍길동", "880909", 10000);
				통장 주택청약 = new 통장("홍길동", "880909", 20000);
				// 잘 만들어진 것인지 확인
				System.out.println(여행통장.name);
				System.out.println(여행통장.money);
				
				
				System.out.println(여행통장);
	
	}

}
