package 상속;

public class CoffeeTruck extends Truck{

	
	
			String type; // 트럭 용도
			
			
			public void 운송하다() {
				System.out.println("물건을 운송하다.");
			}
			
			@Override
			public String toString() {
				return "CoffeeTruck [type=" + type + ", door=" + door + ", jimcan=" + jimcan + ", wheel=" + wheel
						+ ", size=" + size + ", color=" + color + "]";
			}
			
			
			
		
}
