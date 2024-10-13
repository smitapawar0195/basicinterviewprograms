package Basic_Pro;

public class PrintEachWrdOnNxtLine {
	public static void main(String[] args) {
		String s = "good morning";
		char c[] = s.toCharArray();
		String op = "";
		for (int i = 0; i < c.length; i++) {
			op = op + c[i];
			System.out.println(op);
		}

	}
}
