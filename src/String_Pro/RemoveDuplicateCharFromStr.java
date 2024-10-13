package String_Pro;

public class RemoveDuplicateCharFromStr {
	public static void main(String[] args) {
		String s = "javaprogramming";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (res.contains("" + s.charAt(i)) == false) {
				res = res + s.charAt(i);
			}
		}
		System.out.println(res);
	}
}
