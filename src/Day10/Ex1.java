package Day10;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point point = new Point(1,2);
		
		point.set(1, 2);
		
		point.showPoint();
		
		
		ColorPoint cPoint = new ColorPoint(3,4,"green");
		
		cPoint.set(3, 4);
		cPoint.showPoint();
		
		cPoint.setColor("green");
		
		cPoint.showColorPoint();
		
		Point p = new ColorPoint(3, 4, "green");
		
		
	}

}
