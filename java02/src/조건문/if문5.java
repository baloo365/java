package 조건문;

public class if문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String ssn = "205511"; // 주민 번호 뒷자리, ssn == "205511" 비교 불가, 비교 연산자는 기본데이터만 가능하기 때문
					
			if (ssn.equals("205511")) {
				System.out.println("동일한 지역에서 태어나셨군요!!");
			} else {
				System.out.println("동일한 지역에서 태어난 게 아니시군요!!");
			}
			char gender = ssn.charAt(0); // 첫번쨰 자리에 있는 문자 하나 추출
				
				switch (gender) {
				case '1': case '3':
					System.out.println("남자");
					break;
				case '2': case '4':
					System.out.println("여자");
					break;
				
				}
	
	}

}
