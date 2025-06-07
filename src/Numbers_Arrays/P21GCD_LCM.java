package Numbers_Arrays;

import java.util.Scanner;

public class P21GCD_LCM {
    public static void main(String[] args) {
        int i, n, m, GCD = 1;
        System.out.println("Enter two number to check it's GCD and LCM = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (i = 1; i < n && i < m; i++) {
            if (n % i == 0 && m % i == 0) {
                GCD = i;
            }
        }
        System.out.println("HCF or GCD of two numbers is = " + GCD);
        System.out.println("LCM of two numbers is = " + ((n * m) / GCD));
    }
}
