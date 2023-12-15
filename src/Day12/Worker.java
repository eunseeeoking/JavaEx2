package Day12;

public class Worker implements Human {

	@Override
	public void walk(int x) {

		System.out.println(x + "미터를 걷다.");
	}

	@Override
	public void eat(String food) {
		System.out.println(food + "를 먹다.");
	}

	@Override
	public void sleep() {
		System.out.println("잔다.");
	}

	void work() {
		System.out.println("일하다.");
		System.out.println("너무 당연한 이야기.");
	}

}
