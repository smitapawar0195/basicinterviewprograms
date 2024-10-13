package String_Pro;

public class RevStrWIthAndWithoutChangingPosition {
	public static void main(String[] args) {
		String s = "Hi this smita";
		String t[] = s.split(" ");
		String op = "";
		for (int i = 0; i < t.length; i++) {
			String rev = "";
			for (int j = 0; j < t[i].length(); j++) {
				rev = t[i].charAt(j) + rev;
			}
			System.out.println(rev);
			op = rev + " " + op;
		}
		System.out.println(op);
	}

}
