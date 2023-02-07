package 조건문;

public class if문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// 조건이 여러개일 때
			int myNum = 99;
			
			if (myNum >= 80) {
				System.out.println("최우수");
			}
			else if (myNum >= 70) {
				System.out.println("우수");				
			}
			else if (myNum >= 60) {
				System.out.println("보통");				
			}
			else {
				System.out.println("미달");
			}
			
			int myTour = 6;
			switch (myTour) {
			case 10:
				System.out.println("VVIP");
				break;
			case 6:
				System.out.println("VIP");
				break;
			default:
				System.out.println("Normal");
				break;
			}
	}

}
