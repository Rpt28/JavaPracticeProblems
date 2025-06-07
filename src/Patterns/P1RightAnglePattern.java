package Patterns;

public class P1RightAnglePattern {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        char a, b;
        for (a = 'A'; a <= 'E'; a++) {
            for (b = 'A'; b <= a; b++) {
                System.out.print(b);
            }
            System.out.println(" ");
        }
        System.out.println("");
        int x, y;
        for (x = 1; x <= 5; x++) {
            for (y = 1; y <= x; y++) {
                System.out.print(y);
            }
            System.out.println(" ");
        }
    }
}
