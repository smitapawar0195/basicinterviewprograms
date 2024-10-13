package iqstringtransformation_programs;

public class Str_2_A_3_B_4_C {

	public static void main(String[] args) {
		String s = "2a3b4c";
		String op = "";
		for (int i = 0; i < s.length(); i = i + 2) {
			char c = s.charAt(i + 1);
			int count = Character.getNumericValue(s.charAt(i));
			for (int j = 0; j < count; j++) {
				op = op + c;
			}
		}
		System.out.println(op);
	}

}
