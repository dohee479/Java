package ch05;

import java.util.Arrays;

public class Exam06 {

	public static void main(String[] args) {
		
		// 배열 생성
		String[] arr1 = new String[3];
		
		// 배열 항목의 값을 읽고 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		// 배열 항목의 값을 변경
		arr1[0] = "이";
		arr1[1] = "이";
		arr1[2] = "잉";
		
		// 배열 항목의 값을 읽고 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println(arr1[0].equals("이"));
		System.out.println(!arr1[1].equals("이"));
	}
}
