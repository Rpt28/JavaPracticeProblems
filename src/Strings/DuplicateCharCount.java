package Strings;
public class DuplicateCharCount {
	public static void main(String[] args) {
		String s1 = "abcabcd";
		String s3 = "";
		char s2[] = {};
		s2 = s1.toCharArray();
		int i, j;
		for (i = 0; i < s1.length(); i++) {
			int counter = 1;
			for (j = i + 1; j < s1.length(); j++) {

				if ((s2[i]) == s2[j]) {
					counter++;
					s2[j] = '0';
				}
			}
			if (s2[i] != '0') {
				System.out.println("The character " + s2[i] + " is gettting repeated " + counter + " times.");
			}
		}
		for (i = s1.length() - 1; i >= 0; i--) {
			s3 = s3 + s1.charAt(i);
		}
		System.out.println("Reverse of string : " + s1 + " is = " + s3);
	}
}