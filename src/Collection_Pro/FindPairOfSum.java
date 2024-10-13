package Collection_Pro;

import java.util.HashSet;
import java.util.Set;

public class FindPairOfSum {
	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 6, 3, 2, 0 };
		int sum = 6;
		Set<Integer> s = new HashSet<Integer>();
		for (Integer num : a) {
			int comp = sum - num;
			if (s.contains(comp)) {
				System.out.println("Pair of num:" + comp + "+" + num + "=" + sum);
			}
			s.add(num);
		}
	}
}
