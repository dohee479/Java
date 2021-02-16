package ch02;

public class Exam01 {

	public static void main(String[] args) {
		// 정수 타입의 변수 선언과 값 저장
		byte var1 = 1;
		short var2 = 1;
		int var3 = 1;
		long var4 = 1;
		
		// 변수 value 선언, 초기화x
		// 변수는 초기화 되어야 읽을 수 있다
		int value; 
		
		// 문자 타입의 변수 선언과 값 저장
		char var9 = 65;
		char var10 = 'A';
		System.out.println(var10);
		
		// '' 따옴표 사이를 붙여쓰면 컴파일 에러
		// String 은 "" 가능
		char c = ' ';
		
		// 실수 타입의 변수 선언과 값 저장
		float var5 = 0.123456789123456789f;
		double var6 = 0.123456789123456789;
		System.out.println("var5: " + var5);
		System.out.println("var6: " + var6);
		
		// 논리 타입의 변수 선언과 값 저장
		boolean var7 = true;
		boolean var8 = false;
	}

}
