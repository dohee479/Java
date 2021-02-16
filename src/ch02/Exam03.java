package ch02;

public class Exam03 {

	public static void main(String[] args) {
		
		// int 타입 이하의 피연산자의 연산은 결과가 int
		byte var1 = 10;
		byte var2 = 20;
		int var3 = var1 + var2;
		byte var4 = (byte) (var1 + var2);
		
		int var5 = 10;
		long var6 = 20;
		long var7 = var5 + var6;
		
		int var8 = 10;
		double var9 = 1.5;
		double var10 = var8 + var9;
		System.out.println(var10);
	}

}
