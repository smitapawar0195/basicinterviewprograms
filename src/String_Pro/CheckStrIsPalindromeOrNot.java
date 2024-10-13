package String_Pro;

public class CheckStrIsPalindromeOrNot {
	public static void main(String[] args) {
		String s = "nayan";
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			rev = s.charAt(i) + rev;
		}
		if (s.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

}
