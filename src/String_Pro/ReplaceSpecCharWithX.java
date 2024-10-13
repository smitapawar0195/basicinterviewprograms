package String_Pro;

public class ReplaceSpecCharWithX {
	public static void main(String[] args) {
		String s = "!12@m$059mitaP12@w@r";
		char t[] = s.toCharArray();
		

		for (int i = 0; i < t.length; i++) {
			if (Character.isLetter(t[i]) == false) {
				t[i] = 'x';

			}
		}
		for (char c : t) {
			System.out.print(c);
		}
	}
}
