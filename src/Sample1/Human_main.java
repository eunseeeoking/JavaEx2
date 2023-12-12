package Sample1;

public class Human_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human lee = new Human("이동재");
		Human park = new Human("박승영");
		Human kim = new Human("김동휘");
		Human hwang = new Human("황선영");
		Human won = new Human("원희수");

		lee.setMoney(300000);

		System.out.println(park.getMoney());

		kim.setMoney(300000 - 50000);

		System.out.println(hwang.getMoney());

		lee.setAge(30);

		System.out.println(park.getAge());
		System.out.println(Math.min(30, 80));

		lee.money = 300000;
		Human.money = 1000000;

		Human.statictest();
	}

}