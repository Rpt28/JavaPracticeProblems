package numbers;
import java.util.Scanner;
public class P6Multiplication {

	public static void main(String[] args) {
		int n,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number to print it's table");
		n=in.nextInt();
		for(i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}

}
