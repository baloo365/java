package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 배열만들기-이미 값을 알고 있는 경우
		String[] hobby = {"수영", "필라테스", "클라이밍", "배드민턴", "탁구", "축구", "영화감상", "노래감상"};
		//2. 배열만들기-값을 모르고 있는 경우, 공간부터 만들어두자.
		String[] jobs = new String[5];
		
		//for-each문: 알아서 처음부터 인덱스를 하나씩 증가하면서 하나씩 꺼내온다.
		//출력용!! 읽기전용
		
		for (String x : hobby) {
			System.out.println(x);
		}
		
		// 다음의 데이터를 다룰 수 있는 배열을 만들어 임의의 데이터를 넣은 후, 프린트해보시오.
		
		String[] tour = {"대만", "도쿄", "강릉", "속초", "부산"};
		for (String x : tour) {
			System.out.println(x);
		}
		
		char[] color = {'b', 'g', 'y', 'b', 'g'};
		for (char x : color) {
			System.out.println(x);
		}
		
		
		double[] height = {177.7, 188.8, 167.5, 172.2, 161.3};
		for (double x : height) {
			System.out.println(x);
		}
		
		
	}

}
