package 배열응용;

public class 여러개배열사용하기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] 식구 = { "아버지", "어머니", "형", "나" };
		int[] age = { 100, 50, 30, 25 };
		double[] height = { 175.5, 150.5, 180.5, 175.5 };
		// 컨트롤 + 쉬프트 + f : 코드 자동 정렬
		
		for (int i = 0; i < height.length; i++) {
			System.out.println(식구[i] + "\t" + age[i] + "\t" + height[i]);
		}
	}

}
