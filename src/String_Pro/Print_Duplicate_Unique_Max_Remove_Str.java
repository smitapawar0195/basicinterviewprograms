package String_Pro;

public class Print_Duplicate_Unique_Max_Remove_Str {

	public static void verifyUniqueEle() {
		String s = "test test basic java code test";
		String t[] = s.split(" ");

		for (int i = 0; i < t.length; i++) {
			if (t[i].equals("")) {
				continue;
			}

			int count = 1;	
			for (int j = i + 1; j < t.length; j++) {
				if (t[i].equals(t[j])) {
					count++;
					t[j] = "";
				}
			}
			if (count == 1) {
				System.out.print(t[i] + " ");
			}
		}

	}

	public static void verifyRemoveDuplicateEle() {
		String s = "test test basic java code test";
		String t[] = s.split(" ");

		for (int i = 0; i < t.length; i++) {
			if (t[i].equals("")) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < t.length; j++) {
				if (t[i].equals(t[j])) {
					count++;
					t[j] = "";
				}
			}
			if (count >= 1) {
				System.out.print(t[i] + " ");
			}
		}

	}

	public static void verifyDuplicateEle() {
		String s = "test test basic java code test";
		String t[] = s.split(" ");

		for (int i = 0; i < t.length; i++) {
			if (t[i].equals("")) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < t.length; j++) {
				if (t[i].equals(t[j])) {
					count++;
					t[j] = "";
				}
			}
			if (count > 1) {
				System.out.print(t[i] + " ");
			}
		}

	}

	public static void verifyMaxCountOfEle() {
		String s = "test test basic java code test";
		String t[] = s.split(" ");
		String maxWord = "";
		int maxCount = 0;

		for (int i = 0; i < t.length; i++) {
			if (t[i].equals("")) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < t.length; j++) {
				if (t[i].equals(t[j])) {
					count++;
					t[j] = "";
				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxWord = t[i];
			}
		}
		System.out.println(maxWord + ":" + maxCount);

	}

	public static void main(String[] args) {
		System.out.println("***************Print Duplicate Words.*****************");
		verifyDuplicateEle();
		System.out.println("***********Print Unique Words***********************");
		verifyUniqueEle();
		System.out.println("****************Remove Duplicate Words***************");
		verifyRemoveDuplicateEle();
		System.out.println("****************Print Max Count Of Words***************");
		verifyMaxCountOfEle();
	}
}
