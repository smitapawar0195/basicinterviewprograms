package iqstringtransformation_programs;

public class RemoveSpecCharStr {
	public static void main(String[] args) {
		String s = "@21a02b7@3c";
		String op = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				if (i + 1 < s.length() && Character.isLetter(s.charAt(i + 1))) {
					char ch = s.charAt(i + 1);
					int count = Character.getNumericValue(c);
					for (int j = 0; j < count; j++) {
						op = op + ch;
					}
				}
			}
		}
		System.out.println(op);
	}
}
