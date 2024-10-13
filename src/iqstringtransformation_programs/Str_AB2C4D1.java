package iqstringtransformation_programs;

public class Str_AB2C4D1 {
	public static void main(String[] args) {
		String s = "AB2C4D1";
		String op = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				int count = Character.getNumericValue(c);
				for (int j = 0; j < count; j++) {
					op = op + "*";
				}
			} else {
				op = op + c;
			}
		}
		System.out.println(op);
	}

}
