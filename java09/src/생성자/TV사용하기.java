package 생성자;


public class TV사용하기 {

		public static void main(String[] args) {
			TV tv1 = new TV();
			tv1.ch = 10;
			tv1.vol = 9;
			tv1.onoff = true;
			tv1.채널을바꾸다();
			System.out.println(tv1.ch + " " + tv1.vol + tv1.onoff);
			
			TV tv2 = new TV();
			tv1.ch = 20;
			tv1.vol = 15;
			tv1.onoff = false;
			tv1.유튜브보다();
			System.out.println(tv2.ch + " " + tv2.vol + tv2.onoff);
			
		}
}
