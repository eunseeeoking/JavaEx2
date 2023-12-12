package Sample1;

public class Calculator {
	int a;
	int b;
	int c;

	static final double PI = 3.14;

	static int sum(int a, int b) {
		return a + b;
	}

	static int sum(int a, int b, int c) {
		return a + b + c;
	}

	static double sum(double a, double b) {
		return a + b;
	}

	static double circleArea(int radius) {
		return radius * radius * PI;
	}

}
