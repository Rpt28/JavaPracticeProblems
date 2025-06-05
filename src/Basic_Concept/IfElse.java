package basic;
import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		int obtainmarks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how much marks you obtained = ");
		obtainmarks = sc.nextInt();
		if(obtainmarks==100) {
			System.out.println("Excellent");
		}
		else if(obtainmarks<100 && obtainmarks>=80) {
			System.out.println("Doing good");
		}
		else if(obtainmarks<80 && obtainmarks>=50) {
			System.out.println("Can do good");
		}
		else if(obtainmarks<50 && obtainmarks>=25) {
			System.out.println("Need improvement");
		}
		else {
			System.out.println("Failed.");
		}
	}

}
