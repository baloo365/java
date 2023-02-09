package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = new int[10]; // 안보이지만 length: 10이 저장되어있음. 
		// 실제로 저장공간이 x, 배열 값 10개, length까지해서 12개 있음.
		x[0] = 10;
		x[1] = 20;
				
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] +" ");
		}
		
		
		// 우리가족의 성별을 char로 저장, 프린트
		// 우리가족의 이름을 String[]으로 저장, 프린트
		// 우리 가족의 시력을 double[]로 저장, 프린트
		
		char[] gender = {'남', '여', '여', '남', '여', '여'}; // 성멸
		
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " "); 
		}
		
		String[] name = {"진", "지민","뷔", "랩몬", "제이홉", "슈가"}; // 이름
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		
		Double[] eye = {1.2, 1.0, 1.0, 0.8, 0.3, 0.2}; // 시력
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}
		
		boolean[] food = {true, true, true, true, false, false}; // 식사 여부
		for (int i = 0; i < food.length; i++) {
			System.out.print(food[i] + " ");
		}
		
		
		
		
	}

}
