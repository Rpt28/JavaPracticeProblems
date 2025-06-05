package Numbers_Arrays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class P13Fibonacci {

	public static void main(String[] args) {
		//fibonacci = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		int n,a=0,b=1,c=0,i;
		System.out.println("Enter upto how many series of number you want to print : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.print(a+" "+b);
		for(i=0;i<n;i++) {
			c=a+b;
			System.out.print(" "+c+" ");
			a=b;
			b=c;
		}
		
	}

}
