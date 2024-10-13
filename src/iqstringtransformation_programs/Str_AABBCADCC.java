package iqstringtransformation_programs;

public class Str_AABBCADCC {

	public static void main(String[] args) {
		String s = "AABBCADCC";
		String op = "";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				op = op + c;
				if (count > 1) {
					op = op + count + "";
					count = 1;
				}
				
			}

		}
		System.out.println(op);
	}

}
