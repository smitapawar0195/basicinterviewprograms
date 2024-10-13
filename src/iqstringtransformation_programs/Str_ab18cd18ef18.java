package iqstringtransformation_programs;

public class Str_ab18cd18ef18 {
	public static void transStr() {
		String s = "ab5cd6ef7";// 18fedcba
		char c[] = s.toCharArray();
		String op = "";
		int sum = 0;
		for (char a : c) {
			if (Character.isDigit(a)) {
				sum = sum + Character.getNumericValue(a);
			}
		}
		for (char b : c) {
			if (Character.isLetter(b)) {
				op = b + op;

			}
		}
		op = sum + op;
		System.out.println(op);

	}

	public static void main(String[] args) {
		String s = "a@b#5c%d&6e*f!7";
		char c[] = s.toCharArray();
		String op = "";
		String sp = "";
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			if (Character.isLetterOrDigit(c[i])) {
				op = op + c[i];

			}

		}
		char ch[] = op.toCharArray();
		for (char a : ch) {
			if (Character.isDigit(a)) {
				sum = sum + Character.getNumericValue(a);
			}
		}
		for (char b : ch) {
			if (Character.isDigit(b)) {
				sp = sp + sum;
			} else {
				sp = sp + b;
				// sum = sum - 1; //op = ab18cd17ef16
			}
		}
		System.out.println(sp);
	}
}
