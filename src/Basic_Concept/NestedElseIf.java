package basic;
import java.util.Scanner;

public class NestedElseIf {

	public static void main(String[] args) {
		int marks,passing;
		char grade;
		passing=40;
		Scanner input=new Scanner(System.in);
		System.out.println("how much marks obtained = ");
		marks=input.nextInt();
		if(marks>=passing) {
			if(marks>=90) {
				grade = 'A';
			}
			else if(marks>=75) {
				grade = 'B';
			}
			else if(marks>=60) {
				grade = 'C';
			}
			else
				grade = 'D';
			System.out.println("You passed with grade : "+grade);
		}
		else {
		grade = 'F';
		System.out.println("You failed and the grade is : "+grade);
		}
		
	}

}
