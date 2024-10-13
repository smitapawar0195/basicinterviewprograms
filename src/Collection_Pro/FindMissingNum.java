package Collection_Pro;

import java.util.ArrayList;

public class FindMissingNum {
	public static void main(String[] args) {
		int a[] = { 2, 8, 12 };
		int m = a[0];
		int n = a[a.length - 1];
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = m; i <= n; i++) {
			al.add(i);
		}
		System.out.println(al);
	}
}
