package 메서드연습;

public class 계산기2 {

	 // 입력값을 다르게 하면 메서드 이름을 똑같이 줄 수 있다.
	 // 하나의 이름으로 다양한 형태를 구현 가능하다.
	// ==>> 다형성(오버로딩, 로딩은 불려진다(호출된다)는 뜻)
	// 오버로딩해서 하나 더 만들라는 뜻은, 똑같은 이름의 메서드 하나 더 만들라는 뜻
	public int add(int x, int y) {
		return x + y;
	}
	
	public double add(int x, double y) {
		return x + y;
	}
	
	
	public double add(double x, double y) {
		return x + y;
	}
	
	public String add(String x, int y) {
		return x + y +"시에 점심을 먹겠어";
	}
	
}