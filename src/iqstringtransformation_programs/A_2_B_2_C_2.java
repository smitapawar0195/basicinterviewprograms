package iqstringtransformation_programs;

public class A_2_B_2_C_2 {

	public static void main(String[] args) {
		String s = "a2b2c2";
		String op = "";
		for (int i = 0; i < s.length(); i = i + 2) {
			char c = s.charAt(i);
			int count = Character.getNumericValue(s.charAt(i + 1));
			for (int j = 0; j < count; j++) {
				op = op + c;
			}
		}
		System.out.println(op);
	}

}
