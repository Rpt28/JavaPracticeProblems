package Strings;

import java.util.Scanner;

public class P6ReverseString {

	public static void main(String[] args) {
		String str1,str2="";
		int i;
		System.out.println("Enter string to reverse it = ");
		Scanner sc = new Scanner(System.in);
		str1=sc.nextLine();
		for(i=str1.length()-1;i>=0;i--){
			str2=str2+str1.charAt(i);
		}
		System.out.println("Reversed string is = "+str2);
	}

}
