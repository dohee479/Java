package ch05homework;
import java.util.Scanner;
public class Ȯ�ι���9 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------");
			System.out.print("����> ");
		}
		
		
		int selectNo = scanner.nextInt();
		
		if (selectNo == 1) {
			System.out.print("�л���>");
			int student = scanner.nextInt();
			studentNum = student;
			scores = new int[studentNum];
		} else if (selectNo == 2) {
			for (int i = 0; i < scores.length; i++) {
				scores[i] = scanner.nextInt();
			}
		} else if (selectNo == 3) {
			for (int i = 0; i < scores.length; i++) {
				System.out.println("scores["+i+"]:" + scores[i]);
			}
		} 
		System.out.println("���α׷� ����");
		

	}

}
