package iqstringtransformation_programs;

public class StrTrans_Rev {
	public static void main(String[] args) {
		String s = "&i a*m& s!m#i$t^a p%a!w@a&r";// rawap atims ma i
		String c[] = s.split(" ");
		String op = "";
		for (int i = 0; i < c.length; i++) {
			String rev = "";
			for (int j = 0; j < c[i].length(); j++) {
				if (Character.isLetterOrDigit(c[i].charAt(j))) {
					rev = c[i].charAt(j) + rev;
				}
			}
			op = rev + " " + op;
		}

		System.out.println(op);
	}
}
