package Strings;

public class P9MaxMinCharOccur {

    public static void main(String[] args) {
        String str1 = "raahuuuuuuuuuuuuuuul Praakkassh Tiwaarriii1111111111111111111111111111111";
        str1 = str1.replaceAll(" ", "");
        int i;
        int[] count = new int[256];
        for (i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            count[ch]++;
        }
        int max = 0;
        int lowest = Integer.MAX_VALUE;
        ;
        char maxchar = ' ';
        char lowchar = ' ';
        for (i = 0; i < 256; i++) {
            if (count[i] > 0) {
                if (count[i] > max) {
                    max = count[i];
                    maxchar = (char) i;
                }
                if (count[i] < lowest) {
                    lowest = count[i];
                    lowchar = (char) i;
                }
            }
        }
        System.out.println("Max occurence of character " + maxchar + " is = " + max);
        System.out.println("Lowest occurence of character " + lowchar + " is = " + lowest);
    }
}
