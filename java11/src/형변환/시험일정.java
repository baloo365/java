package 형변환;

import java.util.LinkedList;

public class 시험일정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList test = new LinkedList();
			test.add("국어");
			test.add("수학");
			test.add("영어");
			test.add("컴퓨터");
			System.out.println(test);
			for (int i = 0; i < test.size()+1; i++) {
				test.remove();
				System.out.println(test);
			}
	}

}
