package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		
		int result1 = Singleton.method1();
		String result2 = Singleton.method2();
		int[] result3 = Singleton.method3();
		
		// �����ڸ� �̿��ؼ� ��ü ���
		Singleton result = new Singleton();
		
		// Factory Method �̿��ؼ� ��ü ���
		Singleton result4 = Singleton.getInstance();
		Singleton result5 = Singleton.getInstance();
		
		if (result4 == result5) {
			System.out.println("���� ��ü ����");
		} else {
			System.out.println("�ٸ� ��ü ����");
		}
 	}

}
