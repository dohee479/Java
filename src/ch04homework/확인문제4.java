package ch04homework;

public class 확인문제4 {

	public static void main(String[] args) {
		int num1  = (int) (Math.random() * 6) + 1;
		int num2  = (int) (Math.random() * 6) + 1;
		
		while (num1 + num2 != 5) {
			System.out.println(num1 + "," + num2);
			num1  = (int) (Math.random() * 6) + 1;
			num2  = (int) (Math.random() * 6) + 1;
		}
	}

}
