package 상속;

public class 내차들 {

	public static void main(String[] args) {
		
		CoffeeTruck ct1 = new CoffeeTruck();
		
		ct1.color = "back";
		ct1.door = 2;
		ct1.jimcan = true;
		ct1.size = "대형";
		ct1.wheel = 6;
		ct1.type ="이사트럭";
		ct1.시동을걸다();
		ct1.멈추다();
		
		System.out.println(ct1);
		
	}

}
