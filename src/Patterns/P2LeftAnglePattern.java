package Patterns;

public class P2LeftAnglePattern {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        int a, b;
        for (a = 5; a >= 1; a--) {
            for (b = a; b >= 1; b--) {
                System.out.print(b);
            }
            System.out.println("");
        }
        System.out.println("");

        char x, y;
        for (x = 'E'; x >= 'A'; x--) {
            for (y = x; y >= 'A'; y--) {
                System.out.print(y);
            }
            System.out.println("");
        }
    }
}
