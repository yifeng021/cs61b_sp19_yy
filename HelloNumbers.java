public class HelloNumbers {
	public static void main(String[] args) {
		int x = 0;
		int cumulativeSum = 0;
		while (x < 10) {
			//System.out.print(x + " ");
			System.out.print(cumulativeSum + " ");
			x = x + 1;
			cumulativeSum = cumulativeSum + x;
		}
		System.out.print("\n");
		String h = 5 + "10";
		System.out.println(h);
		System.out.println(5 + 10);
	}
}

/*
1. Before Java variables can be used, they must be declared.
2. Java variables must have a specific type.
3. Java variable types can never change.
*/