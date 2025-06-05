package Numbers_Arrays;

import java.util.Scanner;

public class P1SwapWithout {

	public static void main(String[] args) {
		int x, y;
		System.out.println("Enter the value of x and y : ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("Before swap x = " + x + " and y = " + y);
		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println("After swap x = " + x + " and y = " + y);

	}

}
