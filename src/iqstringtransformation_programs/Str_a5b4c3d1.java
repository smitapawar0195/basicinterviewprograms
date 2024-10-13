package iqstringtransformation_programs;

public class Str_a5b4c3d1 {

	public static void stringTran1() {
		String s = "a5b4c3d1"; // 13abcd
		char c[] = s.toCharArray();
		String op = "";
		int sum = 0;

		for (char ch : c) {
			if (Character.isDigit(ch)) {
				int count = Character.getNumericValue(ch);
				sum = sum + count;
			} else {
				op = op + ch;
			}
		}
		op = sum + op;
		System.out.println(op);
	}

	public static void stringTran2() {
		String s = "a5b4c3d1";
		String op = "";
		int sum = 0;
		char c[] = s.toCharArray();
		for (char d : c) {
			if (Character.isDigit(d)) {
				int count = Character.getNumericValue(d);
				sum = sum + count;
			} else {
				op = op + d;
			}
		}
		op = op + sum;
		System.out.println(op);

	}

	public static void main(String[] args) {
		stringTran1();
		stringTran2();
	}
}
