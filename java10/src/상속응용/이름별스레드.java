package 상속응용;

public class 이름별스레드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
					//2. 스레드 사용
					이름찍어내기스레드 name = new 이름찍어내기스레드();
					별만들기스레드 star = new 별만들기스레드();
					
					//3. 스래드 프로그램 2개 시작
					name.start();
					star.start();
	}

}
