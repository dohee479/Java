package ch06homework;

public class CarExample {

	public static void main(String[] args) {
		// ��ü ����
		// Car myCar = new Car();
		
		
		// �ʵ尪 �б�
		//System.out.println(myCar.company);
		
		// �ʵ尪 ����
		// myCar.speed = 60;
		
		Car car = new Car("����", 3000);
		
		Car car1 = new Car();
		System.out.println(car1.company);
		
		Car car2 = new Car("�ڰ���");
		System.out.println(car2.company);
		System.out.println(car2.model);

	}

}
