package string;
public class ReverseString {

	public static void main(String[] args) {
		String s1 = "this is an interview";
		String s2 = "";
		char ch;
		System.out.println("Original String : " + s1);
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println("After revesring :" + s2);
	}

}
