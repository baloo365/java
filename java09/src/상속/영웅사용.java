package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			사람  p = new 사람();
			p.name = "사람";
			p.age = 100;
			System.out.println(p);
			p.eat();
			
			맨  m = new 맨();
			m.run();
			
			슈퍼맨 s = new 슈퍼맨();
			s.name = "클라크";
			s.age = 25000;
			s.power = 500000;
			s.fly = true;
			s.eat();
			s.sleep();
			
			원더우먼 ws = new 원더우먼();
			ws.name = "프라임 어스";
			ws.age = 300;
			ws.eat();
			ws.jump();
			ws.tall = 200;
			System.out.println(ws);
	}

}
