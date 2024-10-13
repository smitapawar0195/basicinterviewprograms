package Collection_Pro;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateEleFromArray {
	public static void main(String[] args) {
		int a[] = { 8, 1, 4, 7, 8, 5, 2, 4, 6, 1, 20 };
		LinkedHashMap<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();

		for (int i : a) {
			if (m.containsKey(i)) {
				m.put(i, m.get(i) + 1);
			} else {
				m.put(i, 1);
			}
		}

		for (Map.Entry<Integer, Integer> e : m.entrySet()) {
			if (e.getValue() > 1) {
				System.out.print(e.getKey() + " ");
			}
		}
	}
}
