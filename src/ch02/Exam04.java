package ch02;

public class Exam04 {

	public static void main(String[] args) {
		
		// ���ڿ� => ����(����, �Ǽ�)
		
		// ���ڿ��� String Ÿ�� ������ �����Ѵ�.
		String var1 = "10";
		System.out.println(var1);
		
		// ���ڿ� + ���� 
		String var2 = var1 + 5;
		System.out.println(var2);
		
		// ���ڿ��� ���ڷ� �����ؼ� ���
		int var3 = Integer.parseInt(var1) + 5;
		System.out.println(var3);
		
		// ���ڿ��� �Ǽ��� �����ؼ� ����
		String var4 = "10.5";
		Double var5 = Double.parseDouble(var4) + 2.3;
		System.out.println(var5);
		
		// ���� => ���ڿ�
		int var6 = 3;
		String var7 = var6 + "0";
		System.out.println(var7);
		
		String var8 = String.valueOf(var6);
		
	}

}
