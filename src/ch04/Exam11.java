package ch04;

public class Exam11 {

	public static void main(String[] args) {
		
		int count = 1;
		
		while (true) {
			System.out.println(count);
			count++;
			if (count > 10) {
				 break;
				// return;
			}
		}
		
		System.out.println("프로그램 마무리 내용 실행");
	}
}
