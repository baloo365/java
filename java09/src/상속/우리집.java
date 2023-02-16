package 상속;

public class 우리집 {

	public static void main(String[] args) {
		
		딸 d1 = new 딸("홍길순", "여");
		딸 d2 = new 딸("홍길진", "여");
		System.out.println(d1);
		d1.tv보다();
		System.out.println(d2);
		d2.tv보다();
		
		System.out.println("딸은 총: "+딸.count + "명");
		System.out.println("아빠의 지갑에 들어있는 돈: " + 딸.fWallet);
		

	}

}
