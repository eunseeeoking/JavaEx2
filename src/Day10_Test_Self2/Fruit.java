package Day10_Test_Self2;

public class Fruit {
	String kind;
	String color;
	int price;

	
	Fruit(){
		
	}
	
	Fruit(String kind, String color, int price){
		this.kind = kind;
		this.color = color;
		this.price = price;
		
	}
	
	
	void getPrice() {
		System.out.println(kind + "는"+price+"원 입니다.");
	}
}
