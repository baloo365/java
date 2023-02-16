package 상속;

public class Mask {

		String color;
		int price;
		int howMany;
		
		public Mask(String color, int price, int howMany) {
			this.color = color;
			this.price = price;
			this.howMany = howMany;
		}

		@Override
		public String toString() {
			return "Mask [color=" + color + ", price=" + price + ", howMany=" + howMany + "]";
		}
		
		

}
