public class MaxDemo {
	public static int Max(int x, int y) {
		if (x > y) {
			return x;
		}
		return y;
	}

	public static void main(String[] args) {
		System.out.println(Max(100, 15));
	}
}