package Day11;

public class Fruit_Main {
	
	static void Boxing(Fruit obj) {
		if (obj instanceof Banana) {
			System.out.println("바나나를 상자에 담았다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banana b = new Banana("바나나", "노란색", 10000);
		
		b.getPrice();
		
		Orang o = new Orang("오렌지", "오렌지색", 5000);
	
		Fruit_Main.Boxing(b);
		
		Apple a = new Apple("사과","발간색",3000);
		
		a.getPrice(); // super 를 이용해서 부모의 메소드도 실행하면서 오버라이딩된 문구도 출력
		b.getPrice();// 비교를 위한====
		o.getPrice();// 부모에게 상속된 메소드의 출력====

		
	}
	

}
