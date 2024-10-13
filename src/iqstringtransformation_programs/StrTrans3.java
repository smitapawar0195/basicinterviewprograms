package iqstringtransformation_programs;

public class StrTrans3 {
	public static void main(String[] args) {
		String s = "AB**C****D*";
		String op = "";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '*') {
				count++;
			} else {
				if (count > 0) {
					op = op + count;
					count = 0;
				}
				op = op + c;
			}
		}
		if (count > 0) {
			op = op + count;
		}
		System.out.println(op);
	}
}
