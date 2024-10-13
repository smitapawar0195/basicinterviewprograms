package iqstringtransformation_programs;

public class StrTran3 {
	public static void strTran1() {
		String s = "a5b4c3d1";// a13b12c11d10
		char ch[] = s.toCharArray();
		String op = "";
		int sum = 0;
		for (char c : ch) {
			if (Character.isDigit(c)) {
				int count = Character.getNumericValue(c);
				sum = sum + count;
			}
		}
		for (char d : ch) {
			if (Character.isDigit(d)) {
				op = op + sum;
			} else {
				op = op + d;
			}
		}
		System.out.println(op);
	}

	public static void strTrans2() {
		String s = "a5b4c3d1";// a13b12c11d10
		char ch[] = s.toCharArray();
		String op = "";
		int sum = 0;
		for (char c : ch) {
			if (Character.isDigit(c)) {
				int count = Character.getNumericValue(c);
				sum = sum + count;
				
			}
			
		}
		for (char d : ch) {
			if (Character.isDigit(d)) {
				op = op + sum;
				sum--;
			} else {
				op = op + d;
			}
			
		}
		
		System.out.println(op);

	}

	public static void main(String[] args) {
		strTran1();
		strTrans2();
	}
}
