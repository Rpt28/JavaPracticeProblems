package Numbers_Arrays;

import java.util.Scanner;

public class P23Number_Factor {
    public static void main(String[] args) {
        int n, i;
        System.out.println("Please enter a number to print it's factors = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Factors are = ");
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
