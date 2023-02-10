package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {
	public static void main(String[] args) {
		
		int[] jumsu = new int[5];
		
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			//숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣자.
			jumsu[i] = Integer.parseInt(data);
			
		}
		for (int i : jumsu) {
			System.out.println(i + " ");
		}
		
		//1. 전체 합계
		int sum0 = 0;
		for (int x : jumsu) {
			sum0 = sum0 + x; // sum += x;
		}
		System.out.println("전체 합계: " + sum0);
		
		//1. 전체 합계 구해서, 평균구해보세요.
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum = sum + jumsu[i];
			avg = (double)sum /  jumsu.length; 
			// 정수를 정수로 결과는 무조건 정수이기 때문에 avg를 더블로 했더라도 결과가 .0으로 소수점을 잘라버림.
			// 강제 형변환을 통해 바꿔준다.
		}
		System.out.println("전체 평균 " + avg);
		
		//2. 300이상되는 숫자만 찾아서 합계를 구해보세요.
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300이상 되는 수의 합계 " + sum2);
		
		//3. 심화문제, 300이상 되는 위치가 어딜까?
		
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.println("300인 값이 저장된 인덱스 : " + i);
			}
		}
			
		
		}
		
		
	}

