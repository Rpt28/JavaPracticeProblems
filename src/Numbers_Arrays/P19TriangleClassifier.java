package Numbers_Arrays;

import java.util.Scanner;

public class P19TriangleClassifier {
    public static void main(String[] args) {
        int s1,s2,s3;
        System.out.println("Enter the three sides of a triangle one by one = ");
        Scanner sc = new Scanner(System.in);
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        if(s1<0||s2<0||s3<0){
            System.out.println("Please enter positive whole numbers");
        }
        else if((s1+s2)<=s3 || (s2+s3)<=s1 || (s3+s1)<=s2){
            System.out.println("Triangle cannot be formed as sum of two sides must be greater than third");
        } else if (s1!=s2 && s1!=s3 && s2!=s3) {
            System.out.println("It is a scalene triangle");
        } else if (s1==s2 && s2==s3) {
            System.out.println("It is an Equilateral triangle");
        }
        else
            System.out.println("It is an Isosceles triangle");
    }
}
