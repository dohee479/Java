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
			System.out.println("1.목록 | 2.생성 | 3.읽기 | 4.수정 | 5.삭제 | 6.종료");
			System.out.println("-------------------------------------------");
			System.out.print("골라라골라: ");
			
			
						
			int num = Integer.parseInt(scanner.nextLine());				

			
			if (num == 2) {
				System.out.print("제목: ");
				String title = scanner.nextLine();
				System.out.print("내용: ");
				String content = scanner.nextLine();
				System.out.print("글쓴이: ");
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
				System.out.println("번호: ");
				String number = scanner.nextLine();
				for (int i = 0; i < boardArray.length; i++) {
					if (boardArray[i][0].equals(number)) {
						boardArray[i][4] = Integer.toString(Integer.parseInt(boardArray[i][4]) + 1);
						System.out.println("번호: " + boardArray[i][0]);
						System.out.println("제목: " + boardArray[i][1]);
						System.out.println("내용: " + boardArray[i][2]);
						System.out.println("글쓴이: " + boardArray[i][3]);
						System.out.println("조회수: " + boardArray[i][4]);
						break;
					}
				}
			} else if (num == 4) {
				System.out.println("번호: ");
				String number = scanner.nextLine();
				for (int i = 0; i < boardArray.length; i++) {
					if (boardArray[i][0].equals(number)) {
						System.out.println("기존제목: " + boardArray[i][1]);
						System.out.print("수정제목: ");
						String u_title = scanner.nextLine();
						if (u_title == null) {
							boardArray[i][1] = boardArray[i][1];							
						} else {
							boardArray[i][1] = u_title;
						}
						System.out.println("기존내용: " + boardArray[i][2]);
						System.out.print("수정내용: ");
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
				System.out.print("번호: ");
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
				System.out.println("번호        제목        내용        글쓴이        조회수");
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
		System.out.println("프로그램 종료");
	}

}
