package ch02;

public class Exam02 {

	public static void main(String[] args) {
		
		// �ڵ� Ÿ�� ��ȯ
		byte var1 = 10;
		int var2 = var1;
		
		// ���� Ÿ�� ��ȯ
		int var3 = 1000;
		byte var4 = (byte) var3;
		System.out.println(var3);
		System.out.println(var4);
		
		// �ڵ� Ÿ�� ��ȯ
		int var5 = 10;
		double var6 = var5;
		System.out.println(var6);
		
		long var7 = 10;
		float var8 = var7;
		System.out.println(var8);
		
		// �Ǽ����� ����������
		double var9 = 3.14;
		int var10 = (int) var9;
		System.out.println(var10);
	};

}
