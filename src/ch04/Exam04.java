package ch04;

public class Exam04 {

	public static void main(String[] args) {
		
		char grad = 'A';
		
		switch (grad) {
			case 'A':
				System.out.println("Ŀ�Ǹ� �����մϴ�.");
				break;
				
			case 'B':
				System.out.println("���� 1�ϳ��� �ݴϴ�.");
				break;
				
			case 'c':
				System.out.println("�λ縸 �մϴ�.");
				break;
				
			default:
				System.out.println("����������~");				
		}
		
		if (grad == 'A') {
			System.out.println("Ŀ�Ǹ� �����մϴ�.");
		} else if (grad == 'B') {
			System.out.println("���� 1�ϳ��� �ݴϴ�.");
		} else if (grad == 'C') {
			System.out.println("�λ縸 �մϴ�.");
		} else {
			System.out.println("����������~");
		}
	}

}
