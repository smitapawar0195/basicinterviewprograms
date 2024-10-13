package iqstringtransformation_programs;

public class Str_a5b4_c3d1 {

	public static void main(String[] args) {
		String s = "a5b4c3d1";// 5a4b3c1d
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i = i + 2) {
			char temp = c[i];
			c[i] = c[i + 1];
			c[i + 1] = temp;
		}
		System.out.println(c);

	}

}
