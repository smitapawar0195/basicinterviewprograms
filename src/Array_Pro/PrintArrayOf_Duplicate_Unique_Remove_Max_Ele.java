package Array_Pro;

public class PrintArrayOf_Duplicate_Unique_Remove_Max_Ele {
	public static void verifyRemoveEleOfArray() {
		int a[] = { 5, 4, 1, 2, 4, 7, 8, 2, 0, 4, 0, 0, 0 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == -1) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = -1;
				}
			}
			if (count >= 1) {
				System.out.print(a[i] + " ");
			}
		}

	}

	public static void verifyUniqueEleOfArray() {
		int a[] = { 5, 4, 1, 2, 4, 7, 8, 2, 0, 4, 0, 0, 0 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == -1) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = -1;
				}
			}
			if (count == 1) {
				System.out.print(a[i] + " ");
			}
		}

	}

	public static void verifyDuplicateEleOfArray() {
		int a[] = { 5, 4, 1, 2, 4, 7, 8, 2, 0, 4, 0, 0, 0 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == -1) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = -1;
				}
			}
			if (count > 1) {
				System.out.print(a[i] + " ");
			}
		}

	}

	public static void verifyMaxEleOfArray() {
		int a[] = { 5, 4, 1, 2, 4, 7, 8, 2, 0, 4, 0, 0, 0 };
		int maxCount = 0;
		int maxNum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == -1) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = -1;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxNum = a[i];
			}
		}
		System.out.println(maxNum + " : " + maxCount);

	}

	public static void main(String[] args) {
		System.out.println("****************Remove Duplicate Elements***************");
		verifyRemoveEleOfArray();
		System.out.println();
		System.out.println("****************Print Unique Elements***************");
		verifyUniqueEleOfArray();
		System.out.println();
		System.out.println("****************Print Duplicate Elements***************");
		verifyDuplicateEleOfArray();
		System.out.println();
		System.out.println("****************Print Max Elements***************");
		verifyMaxEleOfArray();
	}
}
