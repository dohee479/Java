package ch04;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		// 키보드로 입력한 내용을 받기 위해 Scanner 생성
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자1: ");
			// int num1 = Integer.parseInt(scanner.nextLine());
			Double num1 = Double.parseDouble(scanner.nextLine());

			System.out.print("숫자2: ");
			// int num2 = Integer.parseInt(scanner.nextLine());
			Double num2 = Double.parseDouble(scanner.nextLine());
			
			// int result = num1 + num2;
			Double result = num1 + num2;
			System.out.println("결과: " + result);
			System.out.println();
		}
		
	}
}
