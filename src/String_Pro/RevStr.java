package String_Pro;

public class RevStr {

	public static void main(String[] args) {
		String s = "my name is smita";
		String c[] = s.split(" ");
		String op = "";

		for (int i = 0; i < c.length; i++) {
			String rev = "";
			for (int j = 0; j < c[i].length(); j++) {
				rev = c[i].charAt(j) + rev + " ";
			}
			//System.out.print(rev);
			op = rev + " " + op;
		}
		System.out.println(op);
	}

}
