package String_Pro;

public class FindDuplicateCharInStr {
	public static void main(String[] args) {
		String s = "javaprogramming";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int count = 0;
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(j) == c) {
					count++;

				}
			}
			if (count > 1 && s.indexOf(c) == i) {
				System.out.println(c + ":" + count);

			}
		}
	}
}
