package Array_Pro;

public class FindDuplicateVal {
	public static void main(String[] args) {
		int a[] = { 5, 4, 1, 2, 4, 7, 8, 2, 0, 4, 0, 0, 0 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == -1) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = -1;
					count++;
				}

			}

			if (count > 1) {
				System.out.print(a[i] + " ");
			}
		}

	}
}
