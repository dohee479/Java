package ch06homework;

public class Calculator {
	static double pi = 3.14159;
	
	void powerOn() {
		System.out.println("���� Ŵ");
	
	}
	static int plus(int x, int y) {
		int result = x+ y;
		return result;
	}
	
	// ���簢���� ����
	double areaRectangle(double width) {
		return width * width;
	
	}
	
	// ���簢���� ����
	double areaRectangle(double width, double height) {
		return width * height;
	
	}
}
