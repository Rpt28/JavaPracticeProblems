package string;
import java.util.Scanner;
public class ReverseInteger {

	public static void main(String[] args) {
		int n,rev=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an Integer to reverse : ");
		n=in.nextInt();
		while(n!=0) {
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		System.out.println("Reverese number is : "+rev);
	}

}
