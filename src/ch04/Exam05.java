package ch04;

public class Exam05 {

	public static void main(String[] args) {
		// 주사위를 던저 나오는 수 얻기(1, 2, 3, 4, 5, 6)
		// int value = ?;

		double temp = Math.random();
		System.out.println(temp); // [0, 1) 0포함 1 포함x
		System.out.println(temp * 6); // [0, 6) 0 <= x < 6
		System.out.println((int) (temp * 6)); // 0, 1, 2, 3, 4, 5
		System.out.println((int) (temp * 6) + 1); // 1, 2, 3, 4, 5, 6
		
		int value = (int) (temp * 6) + 1;
		
		if (value % 2 == 0) {
			System.out.println("짝");
		} else {
			System.out.println("홀");
		}
	}

}
