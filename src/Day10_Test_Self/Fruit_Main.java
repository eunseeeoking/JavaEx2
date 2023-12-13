package Day10_Test_Self;

public class Fruit_Main {
	
	static void Boxing(Fruit obj) {
		if (obj instanceof Banana) {
			System.out.println("상자에 바나나를 담았다.");
		}
	}
public static void main(String[] args) {
	
	Banana b = new Banana("바나나", " 노란색 " , 10000);
	Orange o = new Orange("오렌지", "오렌지색", 5000);
	Apple a = new Apple("사과", "빨간색", 3000);
	
	
	
	a.getPrice();
	
	b.getPrice();
	o.getPrice();
}
}
