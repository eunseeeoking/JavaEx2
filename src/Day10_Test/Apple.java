package Day10_Test;

public class Apple extends Fruit {

	Apple(String kind, String color, int price) {
		super(kind, color, price);
	}

	void getPrice() {

		System.out.println("사과는 할인해서 2000원");
	}
}
