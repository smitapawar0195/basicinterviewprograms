package String_Pro;

public class SwapThePair {
	public static void main(String[] args) {
		String s = "i am smita pawar";
		String t[] = s.split(" ");
		for (int i = 0; i < t.length; i = i + 2) {
			String temp = t[i];
			t[i] = t[i + 1];
			t[i + 1] = temp;
		}
		for (String str : t) {
			System.out.print(str + " ");
		}
	}
}
