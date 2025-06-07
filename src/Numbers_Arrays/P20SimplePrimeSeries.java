package Numbers_Arrays;

import java.util.Scanner;

public class P20SimplePrimeSeries {
    public static void main(String[] args) {
        int i, prime_start = 2, counter = 0, N_Times;
        System.out.print("Enter how many prime numbers you want: ");
        Scanner sc = new Scanner(System.in);
        N_Times = sc.nextInt();

        while (counter < N_Times) {
            boolean isPrime = true;
            for (i = 2; i < prime_start; i++) {
                if (prime_start % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(prime_start + " ");
                counter++;
            }
            prime_start++;
        }
    }
}
