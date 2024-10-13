package Collection_Pro;

import java.util.HashMap;
import java.util.Map;

public class MaxNumOcc {

	public static void main(String[] args) {
		String s = "testingshastra";
		char c[] = s.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char d : c) {
			map.put(d, map.getOrDefault(d, 1) + 1);
		}

		char maxChar = s.charAt(0);
		int maxCount = 0;

		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() > maxCount) {
				maxCount = e.getValue();
				maxChar = e.getKey();
			}
		}
		System.out.println(maxChar + ":" + maxCount);
	}

}
