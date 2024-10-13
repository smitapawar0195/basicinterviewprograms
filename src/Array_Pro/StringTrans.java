package Array_Pro;

public class StringTrans {
	public static void main(String[] args) {
		String s = "aabbacdcc";
		String res = "";
		int count = 1;

		for (int i = 0; i < s.length(); i++) {
			if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				res = res + s.charAt(i);
				if (count > 1) {
					res = res + count;
				}

				count = 1;
			}
		}
		System.out.println(res);

	}
}
