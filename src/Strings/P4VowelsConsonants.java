package Strings;

import java.util.Scanner;

public class P4VowelsConsonants {
    public static void main(String[] args) {
        char ch;
        int i,cons_count=0,vowel_count=0;
        String str = "Hello World, My name is rahul prakash tiwari";
       for(i=0;i<str.length();i++){
           ch=str.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
               vowel_count++;
           }
               else if (ch>='a'||ch<='z')
                   cons_count++;
           }
        System.out.println("Consonant count = "+cons_count+" and Vowel count = "+vowel_count);
       }
}
