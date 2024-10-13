package Array_Pro;

public class AddNumSpecificPosition {
	public static void main(String[] args) {
		int a[] = { 7, 5, 0, 6, 69 };
		int val = 4;
		int index = 2;
		int b[] = new int[a.length + 1];

		for (int i = 0; i < b.length; i++) {
			if (i < index) {
				b[i] = a[i];
			} else if (i == index) {
				b[i] = val;
			} else {
				b[i] = a[i - 1];
			}
		}
		for (int i : b) {
			System.out.println(i);
		}
	}
}
