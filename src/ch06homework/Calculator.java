package ch06homework;

public class Calculator {
	static double pi = 3.14159;
	
	void powerOn() {
		System.out.println("전원 킴");
	
	}
	static int plus(int x, int y) {
		int result = x+ y;
		return result;
	}
	
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	
	}
	
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	
	}
}
