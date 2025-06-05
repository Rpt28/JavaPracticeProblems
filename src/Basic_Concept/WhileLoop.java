package basic;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter and integer : ");
		
		while((n=in.nextInt())!=0) {
			System.out.println("You entered : "+n);
			System.out.println("Enter an Integer : ");
		}
		System.out.println("Out of loop");

	}

}
