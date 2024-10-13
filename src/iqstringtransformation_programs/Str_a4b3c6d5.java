package iqstringtransformation_programs;

public class Str_a4b3c6d5 {

	public static void stringTran1() {
		String s = "a4b3c6d5";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}

			}
		}
		System.out.print(c);

	}

	public static void stringTrans2() {
		String s = "a4b3c6d5";
		String op = "";
		String num = "";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (Character.isDigit(c[i])) {
					if (c[i] < c[j]) {
						char temp = c[i];
						c[i] = c[j];
						c[j] = temp;

					}

				}
			}
		}
		for (char d : c) {
			if (Character.isDigit(d)) {
				num = num + d;
			} else {
				op = op + d;
			}
		}
		op = num + op;
		System.out.println(op);

	}
	
	public static void stringTrans3() {
		String s = "a4b3c6d5";
		String op = "";
		String num = "";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (Character.isDigit(c[i])) {
					if (c[i] < c[j]) {
						char temp = c[i];
						c[i] = c[j];
						c[j] = temp;

					}

				}
			}
		}
		for (char d : c) {
			if (Character.isDigit(d)) {
				num = num + d;
			} else {
				op = d + op;
			}
		}
		op = num + op;
		System.out.println(op);

	}

	public static void stringTrans4() {
		String s = "a4b3c6d5";
		String op = "";
		String num = "";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (Character.isDigit(c[i])) {
					if (c[i] < c[j]) {
						char temp = c[i];
						c[i] = c[j];
						c[j] = temp;

					}

				}
			}
		}
		for (char d : c) {
			if (Character.isDigit(d)) {
				num = d + num;
			} else {
				op = d + op;
			}
		}
		op = num + op;
		System.out.println(op);

	}

	public static void main(String[] args) {
		// stringTran1();
		//stringTrans2();
		//stringTrans3();
		stringTrans4();
	}

}
