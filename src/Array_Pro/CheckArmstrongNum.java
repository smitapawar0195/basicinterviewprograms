package Array_Pro;

public class CheckArmstrongNum {

	public static void main(String[] args) {
		int num = 153;
		int n = num;
		int res = 0;
		while (n > 0) {
			int d = n % 10;
			res = res + d * d * d;
			n = n / 10;
		}
		if (res == num) {
			System.out.println("Number is armstrong.");
		} else {
			System.out.println("Number is not armstrong.");
		}
	}

}
