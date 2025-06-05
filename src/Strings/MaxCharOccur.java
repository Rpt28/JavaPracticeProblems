package string;

public class MaxCharOccur {

	public static void main(String[] args) {
		String str1 = "raahuul Praakkassh Tiwaarriii";
		char[] array = {};
		int i, j;

		array = str1.toCharArray();
		System.out.print("Max Occuring character is: ");
		for (i = 0; i < str1.length(); i++) {
			int counter = 1, MaxOccur = 1;
			for (j = i + 1; j < str1.length(); j++) {
				int CurrentMax = 1;
				if ((array[i] == array[j]) && (array[i] != ' ')) {
					CurrentMax++;
					array[j] = '0';
					if (CurrentMax > MaxOccur) {
						MaxOccur = CurrentMax;
					}
				}
			}
			if ((counter > 1) && (array[i] != '0')) {
				System.out.println(array[i] + " " + " which is occuring " + MaxOccur + " times ");
			}
		}
	}
}