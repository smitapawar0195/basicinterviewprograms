package String_Pro;

public class FindDuplicateStr {
	public static void main(String[] args) {
		String s = "java java programming basic java programming";
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			String c = str[i];
			int count = 0;
			for (int j = i; j < str.length; j++) {
				if (str[j].equals(c)) {
					count++;

				}
			}
			if (count > 1 && s.indexOf(c) == i) {
				System.out.println(c + ":" + count);

			}
		}
	}
}
