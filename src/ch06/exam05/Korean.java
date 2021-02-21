package ch06.exam05;

public class Korean {
	String nation = "한국";
	String name;
	String ssn;
	int age;

	Korean() {
		System.out.println("Korean() 실행쓰");
	}

	Korean(String name) {
		System.out.println("Korean(String name) 실행쓰");
		this.name = name;
	}

	Korean(String name, String ssn) {
		System.out.println("Korean(String name, String ssn) 실행쓰");
		this.name = name;
		this.ssn = ssn;
	}

	Korean(String name, String ssn, int age) {
	}
}