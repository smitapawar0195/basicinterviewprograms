package iqstringtransformation_programs;

public class StrTran2 {

	public static void main(String[] args) {
		String s = "@a2b3@3#c4$";
		String op = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
				if (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
					char ch = s.charAt(i);
					int count = Character.getNumericValue(s.charAt(i + 1));
					for (int j = 0; j < count; j++) {
						op = op + ch;
					}
					i++;
				}

			}
		}
		System.out.println(op);
	}

}
