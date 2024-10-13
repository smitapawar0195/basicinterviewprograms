package String_Pro;

public class PrintChar_Remove_Unique_Max_Duplicate {

	public static void verifyUniqueEle() {
		String s = "testingshastra";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '0') {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
					c[j] = '0';
				}
			}
			if (count == 1) {
				System.out.print(c[i] + " ");
			}
		}

	}

	public static void printDuplicateEle() {
		String s = "testingshastra";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '0') {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
					c[j] = '0';
				}
			}
			if (count > 1) {
				System.out.print(c[i] + " ");
			}
		}

	}

	public static void removeDuplicateEle() {
		String s = "testingshastra";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '0') {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
					c[j] = '0';
				}
			}
			if (count >= 1) {
				System.out.print(c[i] + " ");
			}
		}

	}

	public static void printMaxReapetedChar() {
		String s = "testingshaasstaraa";
		char c[] = s.toCharArray();
		char maxChar = '0';
		int maxCount = 0;

		for (int i = 0; i < c.length; i++) {
			if (c[i] == '0') {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
					c[j] = '0';
				}
			}
			if (maxCount < count) {
				maxCount = count;
				maxChar = c[i];
			}
		}
		System.out.println(maxChar + ":" + maxCount);

	}

	public static void main(String[] args) {
		// verifyUniqueEle();
		// printDuplicateEle();
		// removeDuplicateEle();
		printMaxReapetedChar();
	}

}
