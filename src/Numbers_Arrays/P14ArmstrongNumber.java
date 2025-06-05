package Numbers_Arrays;

import java.util.Scanner;

public class P14ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter number to find that it's Armstrong number or not : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), r, sum = 0, temp;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
	}

}
