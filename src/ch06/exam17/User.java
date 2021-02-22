package ch06.exam17;

public class User {
	
	// Field
	private String id;
	private String name;
	private String password;
	private int age;
	private boolean adult;
	
	// Method
	// Setter
	public void setAge(int age) {
		if (age < 0) {
			this.age = 0;
		} else {
			this.age = age;			
		}
	}
	
	// Getter
	public int getAge() {
		return age;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
	// boolean형일 경우 is로 시작한다. (Getter)
	public boolean isAdult() {
		return adult;
	}
}
