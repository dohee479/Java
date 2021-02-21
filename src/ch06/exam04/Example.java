package ch06.exam04;

public class Example {
	public static void main(String[] args) {
		Korean k1 = new Korean("홍길동", "123456-789123");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		Korean k2 = new Korean("감자바", "483896-159758");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}
}