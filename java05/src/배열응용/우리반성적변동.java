package 배열응용;

public class 우리반성적변동 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n1 = {44, 66, 77, 22, 11};
		int[] n2 = {33, 55, 77, 22, 40};
		
		int count = 0; // 동일한 개수 누적
		int count2 = 0; // 동일하지 않은 개수 누적
		
		for (int i = 0; i < n2.length; i++) {
			if (n1[i] == n2[i]) {
				count++;
			}else {
				count2++;
			}
		}
		System.out.println("동일한 개수: " + count + "\n" + "동일하지 않은 개수: " + count2);
	}

}
