package ch04;

public class Exam10 {

	public static void main(String[] args) {
		
		boolean stop = false;
		int count = 0;
		
		do {
			System.out.println("Hello");
			count++;
			if (count > 10) {
				stop = true;
				System.out.println("----------------------------");
			}
		} while (!stop);
		
		count = 0;
		do {
			System.out.println("Hello");
			count++;
			
		} while (count <= 10); 
	}

}
