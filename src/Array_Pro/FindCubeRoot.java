package Array_Pro;

public class FindCubeRoot {
	public static void main(String[] args) {
		int num = 125;
		for (int i = 0; i < num; i++) {
			if (i * i * i == num) {
				System.out.println("cube root of this number is:" + i);
			}
		}
	}
}
