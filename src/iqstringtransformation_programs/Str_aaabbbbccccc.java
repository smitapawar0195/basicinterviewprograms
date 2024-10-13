package iqstringtransformation_programs;

public class Str_aaabbbbccccc {

	public static void main(String[] args) {
		String s = "aaabbbbccccc";
		String op = "";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				count++;
			}else {
				op = op + c + count + "";
				count = 1;
			}
			
		}
		System.out.println(op);
	}

}
