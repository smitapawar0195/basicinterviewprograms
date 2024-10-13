package String_Pro;

public class SubStrLen {
	public static void main(String[] args) {
		String s = "smitatatatata";
		String sub = "ta";
		int count = 0;
		int subLen = sub.length();
		int taLen = 0;
		int last_TA_Len = -1;
		for (int i = 0; i <= s.length() - subLen; i++) {
			if (s.substring(i, i + subLen).equals(sub)) {
				count++;
				taLen = taLen + subLen;
				last_TA_Len = 1 + subLen;
			}
		}
		System.out.println("Total occurance of 'ta' is: " + count);
		System.out.println("Total length of 'ta' is: " + taLen);
	}
}
