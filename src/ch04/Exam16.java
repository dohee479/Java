package ch04;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		// Ű����� �Է��� ������ �ޱ� ���� Scanner ����
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("����1: ");
			// int num1 = Integer.parseInt(scanner.nextLine());
			Double num1 = Double.parseDouble(scanner.nextLine());

			System.out.print("����2: ");
			// int num2 = Integer.parseInt(scanner.nextLine());
			Double num2 = Double.parseDouble(scanner.nextLine());
			
			// int result = num1 + num2;
			Double result = num1 + num2;
			System.out.println("���: " + result);
			System.out.println();
		}
		
	}
}
