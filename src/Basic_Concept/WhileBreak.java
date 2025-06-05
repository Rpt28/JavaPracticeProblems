package basic;
import java.util.Scanner;
public class WhileBreak {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		
		while(true) {
			System.out.println("please enter an Integer : ");
			n=in.nextInt();
					
			if(n==0)
				break;
		}
		System.out.println("You entered : "+n);

	}

}
