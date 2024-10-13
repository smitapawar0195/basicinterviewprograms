package Collection_Pro;
import java.util.LinkedHashMap;

public class OccuDigitFromArray {
	public static void main(String[] args) {
		int a[] = { 5, 4, 2, 1, 4, 8, 7, 3, 5, 4, 9, 2, 1, 8, 9 };
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i : a) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		map.forEach((k, v) -> System.out.println(k + ":" + v));
	}
}
