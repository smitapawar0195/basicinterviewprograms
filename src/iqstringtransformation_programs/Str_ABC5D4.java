package iqstringtransformation_programs;

public class Str_ABC5D4 {

	public static void main(String[] args) {
		String s = "ABC5D4";
		String op = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				int count = Character.getNumericValue(c);
				for (int j = 0; j < count; j++) {
					op = op + "1";
				}
			} else {
				op = op + c;
			}
		}
		System.out.println(op);
	}

}
