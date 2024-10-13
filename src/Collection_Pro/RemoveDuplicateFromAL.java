package Collection_Pro;

import java.util.ArrayList;

public class RemoveDuplicateFromAL {
	public static void main(String[] args) {
		String s[] = { "hi", "hello", "bye", "bye","hi" };
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> aList = new ArrayList<String>();
		for (String str : s) {
			al.add(str);
		}

		for (String newAl : al) {
			if (aList.contains(newAl) == false) {
				aList.add(newAl);
			}
		}
		System.out.println(aList);
	}
}
