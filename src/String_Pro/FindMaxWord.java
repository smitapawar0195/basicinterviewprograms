package String_Pro;

public class FindMaxWord {

	public static void main(String[] args) {
		String s = "This is a a a a test. This test a test is simple.";
		String w[] = s.toLowerCase().split("\\W+");

		int maxCount = 0;
		String maxWord = "";

		for (int i = 0; i < w.length; i++) {
			if (w[i].equals("")) {
				continue;
			}
			int count = 1;

			for (int j = i + 1; j < w.length; j++) {
				if (w[i].equals(w[j])) {
					count++;
					w[j] = ""; 
				}
			}

			System.out.println(w[i] + ": " + count);

			if (count > maxCount) {
				maxCount = count;
				maxWord = w[i];
			}
		}

		System.out.println("Max occurring word: " + maxWord + " with count: " + maxCount);
	}
}
