package Strings;
public class UniqueStringChar {

	public static void main(String[] args) {
		String str1 = "rwerwersdAAAAARRRREEEEaririajuneja";
		char[] array = {};
		int i, j;

		array = str1.toCharArray();
		System.out.print("Unique characters are: ");
		for (i = 0; i < str1.length(); i++) {
			int counter = 1;
			for (j = i + 1; j < str1.length(); j++) {
				if (array[i] == array[j]) {
					counter++;

					array[j] = '0';
				}
			}
			if ((counter == 1) && (array[i] != '0')) {
				System.out.print(array[i] + " ");
			}
		}
	}
}