package Basic_Pro;

public class PrintStrOnNxtLine {
	public static void main(String[] args) {
		String s = "good morning";
		String t[] = s.split(" ");
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}
}
