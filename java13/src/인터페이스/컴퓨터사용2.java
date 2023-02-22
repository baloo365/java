package 인터페이스;

public class 컴퓨터사용2 {

		public static void main(String[] args) {
			애플컴퓨터 com1 = new 애플컴퓨터();
			바나나컴퓨터 com2 = new 바나나컴퓨터();
			
			com1.화면을만들다();
			com1.키보드를사용하다();
			com1.마우스를사용하다();
			com2.화면을만들다();
			com2.키보드를사용하다();
			com2.마우스를사용하다();
		}
}
