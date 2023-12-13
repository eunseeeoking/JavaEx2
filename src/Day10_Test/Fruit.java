package Day10_Test;

public class Fruit {
	private String kind;
	private String color;
	private int price; // 필드

	Fruit() {
	}

	Fruit(String kind, String color, int price) {
		this.kind = kind;
		this.color = color;
		this.price = price; // 생성자
	}

	void getPrice() {

		System.out.println(kind + "는 " + price + "원 입니다.");

	}// 메소드

	void setFruit(String kind, String color, int price) {
		this.kind = kind;
		this.color = color;
		this.price = price;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
