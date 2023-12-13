package Day10_Test;

public class Fruit_Main {
	static void boxing(Fruit obj) {
		if (obj instanceof Banana) {
			System.out.println("바나나를 상자에 담았다.");
		} else if (obj instanceof Orange) {
			System.out.println("오렌지를 상자에 담았다.");
		} else if (obj instanceof Apple) {
			System.out.println("사과를 상자에 담았다.");
		} else {
			System.out.println("뭔지 모르겠다.");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banana b = new Banana("바나나", "노란색", 10000);
		Orange o = new Orange("오렌지", "주황색", 5000);
		Apple a = new Apple("사과", "빨간색", 3000);

		b.setFruit("바나나", "노란색", 10000);

		a.getPrice();
		b.getPrice();
		o.getPrice();

		Fruit_Main.boxing(o);

		
		b.getPrice();
		
		a.getPrice();
	}

}
