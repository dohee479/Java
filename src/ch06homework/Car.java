package ch06homework;

public class Car {
	
	// �ʵ�
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed;
	int cc;
	
	// ������
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
