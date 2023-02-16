package 생성자;

public class Day {

			String doing;
			int time;
			String location;
			static int count; // 누적하거나 공유할 목적으로 사용
			static int sum;
			public Day(String doing, int time, String location) {
				//new로 부품을 만드는 것(객체생성)
				//객체생성할 때마다 꼭 처리하고 싶은 내용이 있으면
				//생성자 메서드에 써주세요.
				//객체 생성할때 생성자 메서드가 자동호출되기 떄문에 무조건 처리해줌.
				sum += time;
				count++;
				this.doing = doing;
				this.time = time;
				this.location = location;
			}
			@Override
			public String toString() {
				return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
			}
			
			
}
