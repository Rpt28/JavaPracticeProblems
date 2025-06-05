package string;
public class Substring {

	public static void main(String[] args) {
		String s1 = "abcd";
		int i, j;
		String s2 = "";
		char ch[] = s1.toCharArray();
		for (i = 0; i < ch.length; i++) {
			for (j = i + 1; j <= ch.length; j++) {
				s2 = s1.substring(i, j);
				System.out.println(s2);
			}
		}
	}
}