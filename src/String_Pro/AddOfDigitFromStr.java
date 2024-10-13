package String_Pro;

public class AddOfDigitFromStr {

	public static void addOFDigitFromChar() {
		String s = "5mit0ka11a5pawa9";
		int sum = 0;
		char str[] = s.toCharArray();

		for (int i = 0; i < str.length; i++) {
			if (Character.isDigit(str[i])) {
				sum = sum + Character.getNumericValue(str[i]);
			}

		}
		System.out.println(sum);

	}

	public static void addOfDigitFromStr() {
		String s = "5mit0 ka11a5 pawa9";
		int sum = 0;
		String str[] = s.split(" ");

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				if (Character.isDigit(str[i].charAt(j))) {
					sum = sum + Character.getNumericValue(str[i].charAt(j));
				}
			}
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		addOFDigitFromChar();
		addOfDigitFromStr();
	}
}
