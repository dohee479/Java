package ch04homework;
import java.util.Scanner;
public class Ȯ�ι���7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------");
			System.out.print("����> ");
			
			String data = scanner.nextLine();
			
			if (data.equals("1")) {
				System.out.print("���ݾ�>");
				String money = scanner.nextLine();
				balance += Integer.parseInt(money);
				System.out.println();
			} else if (data.equals("2")) {
				System.out.print("��ݾ�>");
				String money = scanner.nextLine();
				balance -= Integer.parseInt(money);
				System.out.println();
			} else if (data.equals("3")) {
				System.out.print(">" + balance);
				System.out.println();
			} else if (data.equals("4")) {
				System.out.println();
				System.out.println("���α׷� ����");
				break;
			}
			
		}
	}

}
