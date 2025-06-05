package Numbers_Arrays;

import java.util.Scanner;

public class P2Swap {

	public static void main(String[] args) {
		int x, y, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of x and y = ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Value before swapping of x = " + x + " and y = " + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping x = " + x + " and y = " + y);
	}

}
