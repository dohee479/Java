package ch05;

import java.util.Arrays;

public class Exam06 {

	public static void main(String[] args) {
		
		// �迭 ����
		String[] arr1 = new String[3];
		
		// �迭 �׸��� ���� �а� ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		// �迭 �׸��� ���� ����
		arr1[0] = "��";
		arr1[1] = "��";
		arr1[2] = "��";
		
		// �迭 �׸��� ���� �а� ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println(arr1[0].equals("��"));
		System.out.println(!arr1[1].equals("��"));
	}
}
