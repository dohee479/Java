package ch06.exam08;

public class BoardService {
	String[][] boards;
	int count;

	BoardService(int rows, int cols) {
		this.boards = new String[rows][cols];
	}

	int getNewBno() {
		return ++this.count;
	}

	void create(int bno, String title, String content, String writer, int hitcount) {
		String[] board = new String[]{"" + this.getNewBno(), title, content, writer, String.valueOf(hitcount)};

		for (int i = 0; i < this.boards.length; ++i) {
			if (this.boards[i][0] == null) {
				this.boards[i] = board;
				break;
			}
		}

	}

	void showList() {
		String[][] var4 = this.boards;
		int var3 = this.boards.length;

		for (int var2 = 0; var2 < var3; ++var2) {
			String[] board = var4[var2];
			String[] var8 = board;
			int var7 = board.length;

			for (int var6 = 0; var6 < var7; ++var6) {
				String val = var8[var6];
				System.out.print(val);
			}

			System.out.println();
		}

	}

	String[] read(int bno) {
		String[] result = null;
		String strBno = String.valueOf(bno);

		for (int i = 0; i < 100; ++i) {
			if (this.boards[i][0] != null && this.boards[i][0].equals(strBno)) {
				result = this.boards[i];
			}
		}

		return result;
	}
}