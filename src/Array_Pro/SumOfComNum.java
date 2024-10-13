package Array_Pro;

public class SumOfComNum {
	public static void main(String[] args) {
		int a[] = { 4, 8, 5, 12, 36, 9 };
		int b[] = { 7, 8, 2, 0, 10, 9 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					sum = sum + a[i];
					break;
				}
			}
		}
		System.out.println(sum);
	}
}
