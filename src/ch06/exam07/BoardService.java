package ch06.exam07;

public class BoardService {
	int count;

	int getNewBno() {
		return ++this.count;
	}

	void save(String title, String content) {
		int bno = this.getNewBno();
		System.out.println(bno + "����");
		System.out.println(title + "����");
		System.out.println(content + "����");
	}

	int getSum(int[] values) {
		int result = 0;
		int[] var6 = values;
		int var5 = values.length;

		for (int var4 = 0; var4 < var5; ++var4) {
			int value = var6[var4];
			result += value;
		}

		return result;
	}

	int getSum2(int... values) {
		int result = 0;
		int[] var6 = values;
		int var5 = values.length;

		for (int var4 = 0; var4 < var5; ++var4) {
			int value = var6[var4];
			result += value;
		}

		return result;
	}
}