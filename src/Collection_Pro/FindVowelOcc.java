package Collection_Pro;

import java.util.HashMap;
import java.util.Map;

public class FindVowelOcc {
	public static void main(String[] args) {
		String s = "universeisunique";
		char c[] = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('a', 0);
		map.put('e', 0);
		map.put('i', 0);
		map.put('o', 0);
		map.put('u', 0);

		for (char d : c) {
			if (map.containsKey(d)) {
				map.put(d, map.get(d) + 1);
			}

		}

		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() > 0) {
				System.out.println(e.getKey() + ":" + e.getValue());
			}
		}
		//map.forEach((k, v) -> System.out.println(k + ":" + v));
	}
}
