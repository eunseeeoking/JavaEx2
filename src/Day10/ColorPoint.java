package Day10;

public class ColorPoint extends Point {

	ColorPoint(int x, int y, String color) {
		super(x, y);
		this.Color = color;
	}

	private String Color;

	public void setColor(String color) {
		this.Color = color;

	}

	void showColorPoint() {
		System.out.print(Color);
		showPoint();
	}

	void showColorPoint(int x, int y, String color) {

		System.out.println(color);
		showPoint();

	}

}
