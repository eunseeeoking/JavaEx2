package Day10;

public class Ex2_Main {

	static void print(Human obj) {
		if (obj instanceof Student) {
			System.out.println("해당 객체는 학생 입니다.");
			System.out.println("응애 응애 응애");
		} else if (obj instanceof Worker) {
			System.out.println("해당 객체는 직장인 입니다.");
			System.out.println("호엥 호엥 호엥");
		} else
			System.out.println("해당 객체는 사람입니다.");
		System.out.println("멍멍");
	}
//	static void print(Student student) {
//		System.out.println("해당 객체는 학생입니다.");
//	}static void print(Worker worker) {
//		System.out.println("해당 객체는 직장인입니다.");
//	}

	public static void main(String[] args) {

		Human r = new Human();
		Student s = new Student();
		Worker w = new Worker();

		Human h2 = new Student();
//		Student s2 = new Human(); (옳지않다)

		Human w2 = new Worker();

		print(r);

	}

	// 해시 함수
	// 네이버 가입

}
