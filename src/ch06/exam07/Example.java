package ch06.exam07;

public class Example {
	public static void main(String[] args) {
		BoardService bs = new BoardService();
		int bno = bs.getNewBno();
		System.out.println(bno);
		bno = bs.getNewBno();
		System.out.println(bno);
		bs.save("����1", "����1");
		bs.save("����2", "����2");
		int[] arr = new int[]{1, 2, 3};
		int sum = bs.getSum(arr);
		System.out.println(sum);
		bs.getSum2(new int[]{1, 2, 3});
		bs.getSum2(new int[]{1, 2, 3, 4, 5});
	}
}