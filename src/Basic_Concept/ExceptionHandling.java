package basic;

public class ExceptionHandling {

	public static void main(String[] args) {
		int x = 5, y = 0, z = 0;
		try {
			z = x / y;
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
