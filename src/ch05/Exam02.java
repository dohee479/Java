package ch05;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {
		
		// ������ �����ϸ鼭 �� ����� ������ ���
		int[] scores = {90, 85, 95};
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		// ������ ������ �� �� ����� ������ ���
		int[] scores2 = null;
		scores2 = new int[] {90, 85, 95};
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		// �޼ҵ� ȣ��
		add(scores2);
		add(new int[] {90, 85, 95});
	}
	
	// �޼ҵ� ����
	public static void add(int[] arr) {
		System.out.println("��: " + Arrays.toString(arr));
		System.out.println("��: " + arr);
	}

}
