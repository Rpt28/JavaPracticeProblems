package string;

public class ReplaceString {

	public static void main(String[] args) {

		String s1 = "Hello World";
		String s2 = "Rahul";
		s1 = s1.replaceAll("World", "Rahul");
		String s3 = s1.toLowerCase();
		String s4 = s2.toUpperCase();
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s4);

	}

}
