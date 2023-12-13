package Day10_Test_Self;

public class Fruit {

	String kind;
	String color;
	int price; //필드
	
	Fruit(){ // 생성자
		
	}
	
	Fruit(String kind, String color, int price)
	{
		this.kind = kind;
		this.color = color;
		this.price = price;
		
	}
	
	
	void getPrice(){ // 메소드
		System.out.println(kind + "는 " +  price + "원 입니다.");
	}
	
	
	
	
}
