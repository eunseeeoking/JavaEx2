package Day12;

public class Point_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);

		System.out.println(p1 == p2);
		String name = "홍길동";
		System.out.println("홍길동" == name);
		System.out.println("홍길동".equals(name));
		System.out.println(name.equals("홍길동"));

		Rect r1 = new Rect(3, 4);
		Rect r2 = new Rect(4, 5);

		// equals 메소드 작성

		// Integer.parseInt("20"); == 숫자로 바뀜
		
		Integer i = Integer.valueOf(10);
		
		System.out.println(i + 20);
		String name2 = "홍길동     ";
		System.out.println(name2.length());
		
		
		
		
		
		
	}

}
