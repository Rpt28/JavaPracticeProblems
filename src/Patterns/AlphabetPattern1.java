package Patterns;
public class AlphabetPattern1 {

	public static void main(String[] args) {
		char i, j;
		for (i = 'A'; i <= 'E'; i++) {
			for (j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		for (i = 'A'; i < 'E'; i++) {
			for (j = 'A'; j <= 'E' - i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}
