package numbers;

import java.util.Scanner;

public class P10PalindromeInteger {

	public static void main(String[] args) {
		int n, temp, sum = 0, rem = 0;
		System.out.print("PLease enter a number to check if it's palindrome or not = ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		temp = n;
		while (n > 0) {
			rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		if (sum == temp)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}
}