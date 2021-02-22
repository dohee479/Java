package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		
		int result1 = Singleton.method1();
		String result2 = Singleton.method2();
		int[] result3 = Singleton.method3();
		
		// 생성자를 이용해서 객체 얻기
		Singleton result = new Singleton();
		
		// Factory Method 이용해서 객체 얻기
		Singleton result4 = Singleton.getInstance();
		Singleton result5 = Singleton.getInstance();
		
		if (result4 == result5) {
			System.out.println("같은 객체 참조");
		} else {
			System.out.println("다른 객체 참조");
		}
 	}

}
