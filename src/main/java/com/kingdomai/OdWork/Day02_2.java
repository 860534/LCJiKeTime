package com.kingdomai.OdWork;

public class Day02_2 {

    public static void main(String[] args) {
        System.out.println(replaceSpaces("Mr John Smith    ", 13));
    }

    public static String replaceSpaces(String S, int length) {
        char[] chars = new char[S.length()];

        int charsIndex = 0;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == ' ') {
                chars[charsIndex++] = '%';
                chars[charsIndex++] = '2';
                chars[charsIndex++] = '0';
            } else {
                chars[charsIndex++] = S.charAt(i);
                System.out.println(1);
                //charsIndex++;
            }
        }

        return new String(chars);
    }
}
