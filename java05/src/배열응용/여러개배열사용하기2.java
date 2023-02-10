package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"홍길동", "이순신", "뉴진스", "방탄", "블랙핑크"};
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		
		//1. 2학기 성적이 오른 학생 몇 명?
		
		int count1 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] > term1[i]) {
				count1++;
			}
		}
		System.out.println("2학기 성적이 더 높은 학생 수: " + count1);
		
		//2. 1학기, 2학기 성적이 동일한 학생 몇 명?
		
		int count2 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count2++;
			}
		}
		System.out.println("1학기 성적과 2학기 성적이 동일한 학생 수: " + count2);
		
		//3. 2학기 학생 중 만점(100)인 학생의 이름과 번호는?
		
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("2학기 만점자 : " + i + "번 " + names[i] );
			}
		}
		
		//4. 1학기 성적의 평균과 2학기 성적의 평균 중 누가 더 높았나요??
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i < term2.length; i++) {
			sum1 += term1[i];
			sum2 += term2[i];
			}
		
		double avg1 = (double)sum1 / term1.length;
		double avg2 = (double)sum2 / term2.length;
		
		if (avg1> avg2) {
			System.out.println("1학기 성적이 더 높다.");
		} else if (avg1< avg2) {
			System.out.println("2학기 성적이 더 높다.");
		}
		//5. 심화) 뉴진스의 1학기 성적, 2학기 성적은?
		for (int i = 0; i < term2.length; i++) {
		if (names[i].equals("뉴진스")) {
				System.out.println("뉴진스의 1학기 성적 : " + term1[i] + 
						"\n" + "뉴진스의 2학기 성적 : " + term2[i]);
			}
		}
		
	}

}
