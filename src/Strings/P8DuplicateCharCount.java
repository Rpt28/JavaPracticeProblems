package Strings;

public class P8DuplicateCharCount {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuvwxyzoiupiouytruewqdsfafhgkjhglkjnbmvbcvcxzx sdfs";
        char s2[] = {};
        int i, j;
        s1 = s1.replaceAll(" ", "");
        s2 = s1.toCharArray();
        for (i = 0; i < s1.length(); i++) {
            int counter = 1;
            for (j = i + 1; j < s1.length(); j++) {
                if (s2[i] == s2[j]) {
                    counter++;
                    s2[j] = '0';
                }
            }
            if (s2[i] != '0') {
                System.out.println("Repeated word is " + s2[i] + " and got repeated " + counter + " times");
            }
        }

    }

}