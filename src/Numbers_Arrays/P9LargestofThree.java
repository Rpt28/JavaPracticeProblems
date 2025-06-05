package numbers;

import java.util.Scanner;

public class P9LargestofThree {

	public static void main(String[] args) {
		int x, y, z;
		System.out.println("enter 3 distinct integers : ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();

		if (x > y && x > z) {
			System.out.println("first number is largest");
		}
		if (y > x && y > z) {
			System.out.println("second number is largest");
		}
		if (z > x && z > y) {
			System.out.println("third number is largest");
		} else
			System.out.println("numbers are not distinct");
	}

}
