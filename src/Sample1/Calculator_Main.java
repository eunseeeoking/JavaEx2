package Sample1;

public class Calculator_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator s = new Calculator();

		System.out.println(s.sum(3, 4));

		System.out.println(s.sum(3, 4, 5));

		System.out.println(s.sum(3.14, 3.15));

		System.out.println(s.circleArea(3));

		System.out.println(3 * 3 * 3.14);

		System.out.println();
		String name = "홍길동";
		String name2 = new String("홍길동");
	
		System.out.println(name.equals(name2));  // .equals 로 문자열을 비교해야함.
	}

}
