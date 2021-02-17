package ch05;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {
		
		// 변수를 선언하면서 값 목록을 제공할 경우
		int[] scores = {90, 85, 95};
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		// 변수를 선언한 후 값 목록을 제공할 경우
		int[] scores2 = null;
		scores2 = new int[] {90, 85, 95};
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		// 메소드 호출
		add(scores2);
		add(new int[] {90, 85, 95});
	}
	
	// 메소드 선언
	public static void add(int[] arr) {
		System.out.println("값: " + Arrays.toString(arr));
		System.out.println("값: " + arr);
	}

}
