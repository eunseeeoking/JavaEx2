package Sample1;

public class Human {
	static int money; // 회비
	private String name;
	private int age;

	
	static void statictest() {
		// name = "홍길동" ; < 당연하게 안되염
		System.out.println("현재 잔액 : " + money);
	}
	
	
	Human(String name) {
		this.name = name;//this = 객체 자신을 의미.
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;//this = 객체 자신을 의미.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;//this = 객체 자신을 의미.
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;//this = 객체 자신을 의미.
	}
	

}
