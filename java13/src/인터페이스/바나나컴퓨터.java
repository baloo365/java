package 인터페이스;

public class 바나나컴퓨터 implements 컴퓨터{

	@Override
	public void 화면을만들다() {
		System.out.println("화면을 20인치로 만들다.");
	}

	@Override
	public void 키보드를사용하다() {
		System.out.println("무선키보드를 사용하다.");
	}

	@Override
	public void 마우스를사용하다() {
		System.out.println("무선마우스를 사용하다.");
	}



	
}
