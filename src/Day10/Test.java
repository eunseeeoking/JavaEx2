package Day10;

public class Test {
	static final double PI = 3.14;
	private String name;
	private String name2;

	Test() {
	}

	Test(String name) {
		this.name = name;
	}

	static int sum(int x, int y, int z) {
		return x + y + z;
	}

	static int sum(int x, int y) {
		return x + y;
	}

	static double sum(double x, double y) {
		return x + y;
	}

	static double circleArea(double radius) {
		return (2 * radius) * PI;
	}

	static int SumArrays(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
//	static int MixArrays(int a[]) {
//		int Mix = 0;
//		int b[] = new int[a.length];
//		for ( int i = 0 ; i < a.length; i ++ ) {
//			for ( int j = 0 ; j < b.length;j++) {
//			if ( a[i]%2==0) {
//				b[j] = a[i];
//			}
//			}
//		}
//	}

	void nameEquals(Test obj) {

		if (this.name.equals(obj.getName())) {
			System.out.println("같은 사람 입니다.");
		} else {
			System.out.println("다른 사람 입니다.");
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}
	
	

}
