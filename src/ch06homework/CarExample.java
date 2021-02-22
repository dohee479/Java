package ch06homework;

public class CarExample {

	public static void main(String[] args) {
		// 객체 생성
		// Car myCar = new Car();
		
		
		// 필드값 읽기
		//System.out.println(myCar.company);
		
		// 필드값 변경
		// myCar.speed = 60;
		
		Car car = new Car("검정", 3000);
		
		Car car1 = new Car();
		System.out.println(car1.company);
		
		Car car2 = new Car("자가용");
		System.out.println(car2.company);
		System.out.println(car2.model);

	}

}
