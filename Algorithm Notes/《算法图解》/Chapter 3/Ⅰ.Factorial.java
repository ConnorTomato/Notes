public class Factorial {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorial(n));
	}
	
	/**
	 * 递归算阶乘
	 * @param n (计算的数)
	 * @return result(计算的结果)
	 */
	private static int factorial(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}
}
