package numbers;

import java.util.Scanner;

public class P8OddEven {

	public static void main(String[] args) {
		int x;
		System.out.println("Please enter a value = ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if (x == 0 || x < 0) {
			System.out.println("Please enter value greater than 0");
		} else if (x % 2 == 0) {
			System.out.println("It is even number");
		} else
			System.out.println("It is odd number");
	}

}
