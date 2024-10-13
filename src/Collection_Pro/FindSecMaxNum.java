package Collection_Pro;

import java.util.TreeSet;

public class FindSecMaxNum {
	public static void main(String[] args) {
		int a[] = { 4, 0, 8, 7, 9, 10, 32 };

		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (Integer i : a) {
			ts.add(i);
		}
		// System.out.println(ts.headSet(ts.last()).last());

		// System.out.println(ts.lower(ts.last()));

		ts.pollLast();
		System.out.println(ts.last());
	}
}
