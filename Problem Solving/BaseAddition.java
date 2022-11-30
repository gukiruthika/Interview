public class BaseAddition {

	public static void main(String[] args) {
		new BaseAddition().init();
	}

	private void init() {
		int num1 = 123, num2 = 13, n = 4;
		System.out.println(toAdd(num1, num2, n));
	}

	private String toAdd(int num1, int num2, int n) {
		int rem = 0;
		String ans = "";
		while (num1 > 0 | num2 > 0) {
			ans = (((num1 % 10) + (num2 % 10) + rem) % n) + ans;
			rem = ((num1 % 10) + (num2 % 10) + rem) / n;
			num1 /= 10;
			num2 /= 10;
		}
		return ans;
	}

}
