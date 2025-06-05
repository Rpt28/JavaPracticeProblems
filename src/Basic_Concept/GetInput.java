package Basic_Concept;
import java.util.Scanner;

class GetInput
{
	public static void main(String args[]) {
		int a;
		String b,c;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Please enter a string input = ");
		b=sc.nextLine();
		System.out.println("You entered the value = " +b);
		
		System.out.print("Please enter a string input = ");
		c=sc.nextLine();
		System.out.println("You entered the value = " +c);
		
		System.out.print("Please enter an integer value = ");
		a=sc.nextInt();
		System.out.println("You entered the value = " +a);
	
	}
}