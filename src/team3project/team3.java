package team3project;
import java.util.Scanner;
public class team3 {


	public static void main(String[] args) throws Exception{
		String[][] boardArray = new String[100][5];
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int boardNum = 0;

		
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.��� | 2.���� | 3.�б� | 4.���� | 5.���� | 6.����");
			System.out.println("-------------------------------------------");
			System.out.print("������: ");
			
			
						
			int num = Integer.parseInt(scanner.nextLine());				

			
			if (num == 2) {
				System.out.print("����: ");
				String title = scanner.nextLine();
				System.out.print("����: ");
				String content = scanner.nextLine();
				System.out.print("�۾���: ");
				String author = scanner.nextLine();
				for (String[] board: boardArray) {
					if (board[0] == null) {
						board[0] = Integer.toString(++boardNum);
						board[1] = title;
						board[2] = content;
						board[3] = author;
						board[4] = "0";
						break;
					}
				}
			} else if (num == 3) {
				System.out.println("��ȣ: ");
				String number = scanner.nextLine();
				for (int i = 0; i < boardArray.length; i++) {
					if (boardArray[i][0].equals(number)) {
						boardArray[i][4] = Integer.toString(Integer.parseInt(boardArray[i][4]) + 1);
						System.out.println("��ȣ: " + boardArray[i][0]);
						System.out.println("����: " + boardArray[i][1]);
						System.out.println("����: " + boardArray[i][2]);
						System.out.println("�۾���: " + boardArray[i][3]);
						System.out.println("��ȸ��: " + boardArray[i][4]);
						break;
					}
				}
			} else if (num == 4) {
				System.out.println("��ȣ: ");
				String number = scanner.nextLine();
				for (int i = 0; i < boardArray.length; i++) {
					if (boardArray[i][0].equals(number)) {
						System.out.println("��������: " + boardArray[i][1]);
						System.out.print("��������: ");
						String u_title = scanner.nextLine();
						if (u_title == null) {
							boardArray[i][1] = boardArray[i][1];							
						} else {
							boardArray[i][1] = u_title;
						}
						System.out.println("��������: " + boardArray[i][2]);
						System.out.print("��������: ");
						String u_content = scanner.nextLine();
						if (u_content == null) {
							boardArray[i][2] = boardArray[i][2];							
						} else {
							boardArray[i][2] = u_content;
						}
						break;
					}
				}
			} else if (num == 5) {
				System.out.print("��ȣ: ");
				String number = scanner.nextLine();
				for (int i = 0; i < boardArray.length; i++) {
					if (boardArray[i][0].equals(number)) {
						for (int j = 0; j < boardArray[i].length; j++) {
							boardArray[i][j] = null;
						}
						break;
					}
				}
			} else if (num == 6) {
				run = false;
			}
			
			if (num == 1 || num == 2 || num == 4) {
				System.out.println("------------------------------------------------");
				System.out.println("��ȣ        ����        ����        �۾���        ��ȸ��");
				System.out.println("------------------------------------------------");
				String[][] boardCopy = new String[100][5];
				
				for (int i = 0; i < boardArray.length; i++) {
					if (boardArray[i][0] != null) {
						boardCopy[i] = boardArray[i];
					} else {
						boardCopy[i][0] ="0";
					}
					
				}
				
				for (int i = 0; i < boardCopy.length; i++) {
					for (int j = 0; j < boardCopy.length - i - 1; j++) {
							if (Integer.parseInt(boardCopy[j][0]) < Integer.parseInt(boardCopy[j + 1][0])) {
								String[] temp = boardCopy[j + 1];
								boardCopy[j + 1] = boardCopy[j];
								boardCopy[j] = temp;
							}
					}
					
				}
				for (String[] board : boardCopy) {
					if (board[0] != "0") {
						System.out.println(board[0] + board[1] + board[2] + board[3] + board[4]);						
					} else {
						break;
					}
				}
			} 
			
		}
		System.out.println("���α׷� ����");
	}

}
