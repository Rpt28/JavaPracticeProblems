package pattern;
import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		int n, i, j;
		System.out.print("Enter upto how many rows you want to print = ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int counter = 1;
		for (i = 0; i < n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(counter + " ");
				counter++;
			}
			System.out.println();
		}
	}
}
