package ch06.exam13;

public class Singleton {
	
	
	// Method
	static int method1() {
		return 1;
	}
	
	static String method2() {
		return "ÀÚ¹Ù";
	}
	
	static int[] method3() {
		int[] arr = {10, 20, 30};
		return arr;
	}
	
	static Singleton getInstance() {
		Singleton s = new Singleton();
		return s;
	}
}
