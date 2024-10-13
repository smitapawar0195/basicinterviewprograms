package Collection_Pro;

import java.util.ArrayList;

import java.util.List;

public class AddNewNumInArr {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int i = 2;
		int v = 35;
		List<Integer> li = new ArrayList<Integer>();
		for (int j = 0; j < a.length; j++) {
			if (j == i) {
				li.add(v);
				li.add(a[j]);
			} else {
				li.add(a[j]);
			}
		}
		System.out.println(li);
	}
}
