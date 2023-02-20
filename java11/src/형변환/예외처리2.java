package 형변환;

import java.io.FileWriter;
import java.io.IOException;

public class 예외처리2 {

	public static void main(String[] args) {
			try {
				FileWriter file = new FileWriter("test.txt");
				file.write("안녕\n");
				file.write("바이바이\n");
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 1. 예외처리를 왜 하는기? 안 하면 어떻게 되는가?
			// ==> 실행할 때 특정한 부분에서 에러가 나면 프로그램이 중단되어 버린다.
			// 특정부분의 실행을 포기하고 프르그램을 중단시키지 않기 위해서
			// 2. 에러는 컴파일에러, 실행에러 비교!!
			// ==> 컴파일(번역)에러ㅣ 영어코드(문법에러)-----번역---->JVM
			// ==> 실행(run-time) 에러: 논리적 문제, 자원 연결 문제, JVM이 실행할 때 발생
			// 3. 자바에서 예외처리하는 방법:
			// try{ 에러가 발생할 것 같은 코드
			// }catch(Exception e){
			//	애러가 발생했을 때 처리 내용 코드
			// }
			// 4. 반드시 예외처리해야하는 경우는?
			// 외부 자원을 연결할 떄(스트림을 사용할 떄): network, file, db, cpu
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
