package Collection_Pro;

import java.util.ArrayList;

public class MergeTwoAr {
	public static void main(String[] args) {
		int a[] = { 5, 1, 4, 6, 3 };
		int b[] = { 8, 2, 7, 9 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i : a) {
			al.add(i);
		}
		ArrayList<Integer> alB = new ArrayList<Integer>();
		for (int ar : b) {
			alB.add(ar);
		}

		al.addAll(alB);
		System.out.println(al);
	}
}
