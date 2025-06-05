package Basic_Concept;
import java.util.Scanner;

public class WhileBreakContinue {

	public static void main(String[] args) {
		int n;
		
		Scanner in=new Scanner(System.in);
				while(true) {
					System.out.println("Please enter an integer");
					n=in.nextInt();
					if(n!=0) {
						System.out.println("You Entered : "+n);
						continue;
					}
					else {
						break;
					}
		}
					

	}

}
