package Day10;

public class Point {

	protected int x, y;

	
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;

	}
	

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}

}
