package Numbers_Arrays;

import java.util.Scanner;

public class P22Digit_Sum {
    public static void main(String[] args) {
        int i, n, sum = 0, rem;
        System.out.println("Please enter a number to calculate it's sum = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("Sum of number is = " + sum);
    }
}
