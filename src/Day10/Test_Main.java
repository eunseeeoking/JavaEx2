package Day10;

import java.util.Arrays;
import java.util.Random;

public class Test_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		String name1 = "홍길동";
		String name2 = new String("홍길동");
		String name3 = "홍길동";
		// String = 변수 , 객체 둘의 특성을 둘다 갖음.
		System.out.println(name1.equals(name2));
		// 문자열을 비교할때는 무조건 .equals 함수를 사용해야 한다.

		if (name1.equals(name2))// true; {
			System.out.println("이름이 같다.");

		int x [ ] = new int [10];
		for (int i = 0 ;  i < x.length ; i ++) {
			x[i] = r.nextInt(30);
		}
		Test obj = new Test();
		System.out.println(Arrays.toString(x));
		System.out.println("배열의 총합 : "+obj.SumArrays(x));
		
		Test hong = new Test("홍길동");
		Test hong2 = new Test("홍길동");
		
		hong2.nameEquals(hong);
		//
		
		
		
	}
}
