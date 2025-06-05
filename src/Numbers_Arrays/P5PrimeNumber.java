package Numbers_Arrays;

import java.util.Scanner;

public class P5PrimeNumber {

	public static void main(String[] args) {
		int n, i, counter = 0;
		System.out.println("Enter a number to check if it is prime number or not = ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n < 0) {
			System.out.println("Please enter a positive integer");
		} else if (n == 0 || n == 1) {
			System.out.println("Not a prime number");
		} else if (n > 1) {
			for (i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					counter++;
				}
			}
			if (counter == 0)
				System.out.println("This is a prime number");
			else
				System.out.println("Number is not prime");
		}

	}
}
