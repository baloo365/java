package 메서드연습;

public class 계산기 {

	public void 더하기(int x, int y) { // 더하기(2,3) 
		//void -> return이 없다라는 의미는 '내가게'가 계산하라고 2,3 파라미터를 '계산기' 줬으나
		// '내가게'가 그 결과를 '계산기'에게 알려주지 않음.
		//.더하기 -> 콜한다.
		System.out.println("더하기 기능 처리 방법 내용....");
		System.out.println(x+y);
		
	}
	
	public void 곱하기(int x, int y, int z) { // 매개변수(파라미터) 
		System.out.println("곱하기 기능 처리 방법 내용....");
		System.out.println(x*y*z);
}
	public int 빼기(int x, int y) {
		System.out.println("빼기 기능 처리 방법 내용");
		return x - y;
		
	}
	
}