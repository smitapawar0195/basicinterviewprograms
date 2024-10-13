package String_Pro;

public class FindMaxLenWord {
	public static void main(String[] args) {
		String s = "theeeeeeeeeeeeeeeeeeee testingtesting shastraclass";
		String t[] = s.split(" ");
		String maxWord = "";
		for (int i = 0; i < t.length; i++) {
			if (t[i].length() > maxWord.length()) {
				maxWord = t[i];
			}
		}
		System.out.println(maxWord);
	}
}
