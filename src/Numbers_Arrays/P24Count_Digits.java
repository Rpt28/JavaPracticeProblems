package Numbers_Arrays;

import java.util.Scanner;

public class P24Count_Digits {
    public static void main(String[] args) {
        int i, counter = 0;
        String n;
        System.out.println("Please enter a number to count digits in it = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        char ch[] = {};
        ch = n.toCharArray();
        for (i = 0; i < n.length(); i++) {
            if (ch[i] % 1 == 0) {
                counter++;
            }
        }
        System.out.println("Total digits are = " + counter);
    }
}
