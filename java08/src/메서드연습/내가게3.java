package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; // 오전에 온 손님의 수
		int count2 = 4; // 오후에 온 손님의 수
		
		//계산기 3을 이용해서주세요.
		
		int totalCostumer = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 " + totalCostumer + "명입니다.");
		
		int gap = cal3.minus(count1, count2);
		System.out.println("오전과 오후 손님의 차이는 " +  gap + "명입니다.");
		
		int morningPrice = cal3.mul(price, count1);
		System.out.println("오전 결제 금액은 " + morningPrice + "원입니다.");
		
		int afternoonPrice = cal3.mul(price, count2);
		System.out.println("오후 결제 금액은 " + afternoonPrice + "원입니다.");
		
		int totalPrice = cal3.add(morningPrice, afternoonPrice);
		System.out.println("오늘 하루 총 결제금액은 " + totalPrice + "원입니다.");
		
		int personalPrice = cal3.div(totalPrice, 9);
		System.out.println("1명 당 결제 금액은 " +  personalPrice + "원입니다.");
	}
}
