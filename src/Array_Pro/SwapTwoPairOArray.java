package Array_Pro;

public class SwapTwoPairOArray {

	public static void main(String[] args) {
		int a[] = { 4, 8, 2, 4, 5, 6, 1, 3, 0, 9 };
		for (int i = 0; i < a.length; i = i + 2) {
			int temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
