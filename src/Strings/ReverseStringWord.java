package Strings;

public class ReverseStringWord {

	public static void main(String[] args) {
		String s1 = "Rahul Prakash Tiwari";
		String[] s2 = s1.split(" ");
		int i;
		String ans = "";
		for (i = s2.length - 1; i >= 0; i--) {
			ans = ans + s2[i] + " ";
		}
		System.out.println(ans.substring(0, ans.length()));
	}
}
