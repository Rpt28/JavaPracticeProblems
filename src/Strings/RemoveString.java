package string;
public class RemoveString {

	public static void main(String[] args) {
		String s1 = "abcdef";
		String s2 = "ijklbcdlmnop";// Remove characters of s2 from s1 and print s1

		char[] array = {};
		char ch;
		int i, j;
		int len1 = s1.length();
		int len2 = s2.length();
		array = s1.toCharArray();
		System.out.print("String with removed characters are: ");
		for (i = 0; i < len1; i++) {
			for (j = 0; j < len2; j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					array[i] = '0';
				}
			}
			if ((array[i] != '0') && (array[i] != ' ')) {
				System.out.print(array[i]);
			}

		}

	}

}
