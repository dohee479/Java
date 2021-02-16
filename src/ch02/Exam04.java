package ch02;

public class Exam04 {

	public static void main(String[] args) {
		
		// 문자열 => 숫자(정수, 실수)
		
		// 문자열은 String 타입 변수에 저장한다.
		String var1 = "10";
		System.out.println(var1);
		
		// 문자열 + 숫자 
		String var2 = var1 + 5;
		System.out.println(var2);
		
		// 문자열을 숫자로 변경해서 계산
		int var3 = Integer.parseInt(var1) + 5;
		System.out.println(var3);
		
		// 문자열을 실수로 변경해서 연산
		String var4 = "10.5";
		Double var5 = Double.parseDouble(var4) + 2.3;
		System.out.println(var5);
		
		// 숫자 => 문자열
		int var6 = 3;
		String var7 = var6 + "0";
		System.out.println(var7);
		
		String var8 = String.valueOf(var6);
		
	}

}
