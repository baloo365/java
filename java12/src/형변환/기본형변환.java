package 형변환;

public class 기본형변환 {

	public static void main(String[] args) {
		byte b1 = 100; // 1바이트, -128~127
		int i1 = 200; // 4바이트,ㅡ -21억~21억
		
		i1 = b1; //큰 <-- 작, 자동으로 형변환(자동형변환)
		b1 = (byte)i1; //작<-- 큰, 강제로 형변환(강제형변환)
		
		double d1 = i1;//자동형변환
		i1 = (int)d1;//강제형변환

		int i2 = 2000;
		byte b2 = (byte)i2; //byte의 범위를 넘어선 127 이상의 숫자는 강제형변환하지 않는다.
		System.out.println(b2);
		

	}

}
