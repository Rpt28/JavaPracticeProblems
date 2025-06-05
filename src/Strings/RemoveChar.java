package Strings;
public class RemoveChar {

	public static void main(String[] args) {
		// Program to remove given character from string
		String s1 = "Riya180703juneja";
		String s2 = "a";
//		s2=s1.replace('a', ' ');
//		s2.trim();
//		for(int i=0;i<s2.length();i++) {
//			if(s2.charAt(i)!=' ') {
//				System.out.print(s2.charAt(i));
//			}
//		}
		char[] array = {};
		int i, j;

		array = s1.toCharArray();
		System.out.print("Initial string is : ");
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.print("\nFinal string is : ");
		for (i = 0; i < s1.length(); i++) {
			for (j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					array[i] = '!';
				}
			}
		}
		for (i = 0; i < array.length; i++) {
			if ((array[i] != '!') && (array[i] != ' ')) {
				System.out.print(array[i]);
			}
		}

	}

}
