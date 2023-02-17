package 상속응용;

public class 별만들기스레드 extends Thread{
//동시에 돌아가게 하는 부품인 Thread를 상속받아서 만들면
//내 부품은 동시에 돌아가는 클래스로 만들어진다.
								
				//1. 동시에 실행할 내용을 run()메서드 안에 넣어주세요.
					@Override
					public void run() {
						for (int i = 0; i < 5000; i++) {
							System.out.println(i + "★");
						}
					}
					
			
	
	
}
