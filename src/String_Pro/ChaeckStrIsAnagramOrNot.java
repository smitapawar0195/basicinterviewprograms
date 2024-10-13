package String_Pro;

public class ChaeckStrIsAnagramOrNot {
	public static void main(String[] args) {
		String s = "bat";
		String str = "act";
		char c[] = s.toCharArray();
		char ch[] = str.toCharArray();
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (c[i] == ch[j]) {
					count++;
					break;
				}
			}
		}
		if (count == c.length) {
			System.out.println("String is anagaram");
		} else {
			System.out.println("String is not anagaram");
		}
	}
}
