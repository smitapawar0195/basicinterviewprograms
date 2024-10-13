package String_Pro;

public class RemoveSpecCharAndRevStr {
	public static void removeSpecialChar() {
		String s = "$m1t@k@i1@sp@war";
		char c[] = s.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (Character.isLetterOrDigit(c[i])) {
				System.out.print(c[i] + " ");
			}

		}

	}

	public static void verifyRemoveSpecialCharAndRevStr() {
		String s = "$m1t@k@i1@sp@war";
		char c[] = s.toCharArray();
		String op = "";
		for (int i = 0; i < c.length; i++) {
			if (Character.isLetterOrDigit(c[i])) {
				op = c[i] + op;
			}

		}
		System.out.println(op);

	}

	public static void printRevStrWithEachCharAndRemoveSpecChar() {
		String s = "! @m $mita Pawar";
		String t[] = s.split(" ");
		String op = "";

		for (int i = 0; i < t.length; i++) {
			String rev = "";
			for (int j = 0; j < t[i].length(); j++) {
				if (Character.isLetterOrDigit(t[i].charAt(j))) {
					rev = t[i].charAt(j) + rev + " ";
				}

			}
			//System.out.print(rev);
			op = rev + " " + op;
		}
		System.out.print(op);
	}

	public static void main(String[] args) {
		// verifyRemoveSpecialCharAndRevStr();
		// removeSpecialChar();
		printRevStrWithEachCharAndRemoveSpecChar();
	}
}
