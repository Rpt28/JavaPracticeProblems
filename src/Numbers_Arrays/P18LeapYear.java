package Numbers_Arrays;

import java.util.Scanner;

public class P18LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year to check if it is a Leap year or Not = ");
        int year;
        Scanner sc = new Scanner(System.in);
        year=sc.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("It is a leap year");
        }
        else
            System.out.println("Not a leap year");
    }
}
