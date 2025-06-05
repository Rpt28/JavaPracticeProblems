package basic;

public class MethodCall {

	public static void main(String[] args) {
		sum(5, 10, 15);
		subtract(10, 4);
		multiply(2, 3);
		divide(10, 5);
	}

	public static void sum(int x, int y, int u) {
		int z = (x + y + u);
		System.out.println(z);
	}

	public static void subtract(int x, int y) {
		int z = (x - y);
		System.out.println(z);
	}

	public static void multiply(int x, int y) {
		int z = (x * y);
		System.out.println(z);
	}

	public static void divide(int x, int y) {
		int z = (x / y);
		System.out.println(z);
	}

}
