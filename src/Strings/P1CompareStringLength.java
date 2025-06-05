package Strings;
import java.util.Scanner;

public class P1CompareStringLength {

	public static void main(String[] args) {
		String s1,s2;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first string : ");
		s1=in.nextLine();
		System.out.println("Enter second string : ");
		s2=in.nextLine();
		if(s1.length()==s2.length())
			System.out.println("Both string length are equal");
		else if((s1.length()>s2.length()))
			System.out.println("First string is bigger than second");
		else
			System.out.println("Second string is bigger than first");
	}

}
