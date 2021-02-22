package ch06homework;

public class Car {
	
	// 필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	int cc;
	
	// 생성자
	Car() {
		
	}
	
	Car(String color, int cc) {
		
	}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		// this.model = model;
		// this.color = color;
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
}
