package ch06.exam06;

public class Korean {
	String nation;
	String name;
	String ssn;
	int age;

	Korean() {
		this("아무개", "0000000-000000", 1);
	}

	Korean(String name) {
		this(name, "000000-000000", 1);
	}

	Korean(String name, String ssn) {
		this(name, ssn, 1);
	}

	Korean(String name, String ssn, int age) {
		this.nation = "한국";
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
}