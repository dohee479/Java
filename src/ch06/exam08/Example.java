package ch06.exam08;

public class Example {
	public static void main(String[] args) {
		BoardService bs = new BoardService(100, 5);
		bs.create(0, "제목1", "내용1", "글쓴이1", 0);
		bs.create(0, "a", "a", "a", 0);
		String[] board = bs.read(2);
		String[] var6 = board;
		int var5 = board.length;

		for (int var4 = 0; var4 < var5; ++var4) {
			String value = var6[var4];
			System.out.print(value + "\t");
		}

	}
}