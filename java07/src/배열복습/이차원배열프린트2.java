package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"라오스", "일본", "대만"},
				{"부산", "싱가포르", "속초"},
				{"제주도", "여수", "강릉"}
		}; //전체를 프린트

			System.out.println(s.length); //행 개수
			
			for (int i = 0; i < s.length; i++) {
				for (int j = 0; j < s[i].length; j++) {
					System.out.println(s[i][j]);
				}
			}
			
				
	}

}
