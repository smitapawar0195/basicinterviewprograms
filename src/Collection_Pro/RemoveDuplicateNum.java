package Collection_Pro;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateNum {
	public static void main(String[] args) {
		int a[] = { 8, 1, 4, 7, 8, 5, 2, 4, 6, 1, 20 };
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : a) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() == 1) {
				System.out.print(e.getKey() + " ");
			}
		}
	}
}
