package 순차문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본 순차문 입력 ==> 입력 --> 처리 --> 출력
		// 입력 -> 부품사용, 망치 같은 언제나 바로 사용할 수 있는 것
		String data1 = JOptionPane.showInputDialog("당신의 취미는? ");
		String data2 = JOptionPane.showInputDialog("언제 하시나요? ");
		// 처리 -> 글자 연결
		String result = "나는 " + data1 + "을 " + data2 + "에 합니다." ;
		// 출력 -> 모니터 화면에 보이고 싶음.
		System.out.println(result);
		
		// 다이얼로그에서 입력한 값은 컴퓨터는 무조건 String으로 인식!!
		String data3 = JOptionPane.showInputDialog("정수를 입력하세요.");
		String data4 = JOptionPane.showInputDialog("정수를 입력하세요.");
		// 처리 -> 숫자 더하기 연산
		//		String을 int로 변경해주어야 함.
		int data11 = Integer.parseInt(data3); // "200" --> 200
		int data22 = Integer.parseInt(data4); // "100" --> 100
		
		int result2 = data11 + data22;
	
		// String result = data1 + data2; --> 결과는 String
		// 출력 -> 모니터 화면에 보이고 싶음.
		System.out.println(result);
		
		
	}

}
