package Day10_Test_Self2;

public class Fruit_main {

	static void boxing(Fruit obj) {
		if(obj instanceof Banana) {
			System.out.println("바나나를 상자에 담았다.");
		}else if(obj instanceof Apple) {
			System.out.println("사과를 상자에 담았다.");
		}else if(obj instanceof Orange) {
			System.out.println("오렌지를 상자에 담았다.");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banana b = new Banana();
		Apple a = new Apple();
		Orange o = new Orange();
		
		
		o.getPrice();

	}

}
