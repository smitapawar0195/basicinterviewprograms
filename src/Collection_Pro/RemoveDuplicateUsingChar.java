package Collection_Pro;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateUsingChar {
	public static void main(String[] args) {
		String s = "aabbcdacc";
		char c[] = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();

		for (char i : c) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() == 1) {
				System.out.print(e.getKey() + " ");
			}
		}
	}
}
