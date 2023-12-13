package Day10;

public class Person_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person hong = new Person("홍길동");
		hong.setAge(20);
		hong.setPhone("123-123");

		System.out.println("이름 : " + hong.getName() + "/ 나이 : " + hong.getAge() + "/ 번호 : " + hong.getPhone());
		System.out.println(MultipleCalc.Mix(30, 20));
		System.out.println(MultipleCalc.Mix(3, 4, 5));

	}

}
