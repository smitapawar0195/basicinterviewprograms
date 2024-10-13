package Collection_Pro;

import java.util.HashSet;

public class FindFirstReapChar {
	public static void main(String[] args) {
		String s = "testingtest";
		char c[] = s.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for (Character ch : c) {
			if (set.add(ch) == false) {
				System.out.println(ch);
				break;
			}
		}
	}
}
