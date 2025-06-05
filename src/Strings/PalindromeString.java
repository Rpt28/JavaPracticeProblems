package string;
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		int i;
		char ch;
		String s2 = "";
		System.out.println("Enter a string to check if it is palindrome or not :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (i = s.length() - 1; i >= 0; i--) {
			s2 = s2 + s.charAt(i);
		}
		if (s.equalsIgnoreCase(s2))
			System.out.println("String is Palindrome!");
		else
			System.out.println("String is not Palindrome!");
	}
}
