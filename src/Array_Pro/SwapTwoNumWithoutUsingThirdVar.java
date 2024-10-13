package Array_Pro;

public class SwapTwoNumWithoutUsingThirdVar {
	public static void main(String[] args) {
		int a = 12;
		int b = 18;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a" + " = " + a);
		System.out.println("b" + " = " + b);
	}
}
