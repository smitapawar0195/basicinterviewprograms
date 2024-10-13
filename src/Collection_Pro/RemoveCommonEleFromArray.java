package Collection_Pro;

import java.util.ArrayList;

public class RemoveCommonEleFromArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int b[] = { 2, 6, 9, 1, 5 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> alB = new ArrayList<Integer>();

		for (Integer i : a) {
			al.add(i);
		}

		for (Integer s : b) {
			alB.add(s);
		}

		al.removeAll(alB);
		System.out.println(al);
	}

}
