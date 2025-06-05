package numbers;

import java.util.Scanner;

public class P15Factorial {

	public static void main(String[] args) {
		int i, n, fact = 1;
		System.out.println("Enter the number to print factorial of it = ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n < 0)
			System.out.println("Pleas enter a positive integer");
		else if (n == 0)
			System.out.println("0 factorial is 1");
		else if (n > 0) {
			for (i = 1; i <= n; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of number is = " + fact);
		}
	}

}
