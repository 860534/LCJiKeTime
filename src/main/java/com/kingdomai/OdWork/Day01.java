package com.kingdomai.OdWork;

import java.nio.charset.StandardCharsets;

public class Day01 {
    public static void main(String[] args) {
        compute("abc");
    }

    public static void compute(String str) {
        if (str.length() > 26) {
            System.out.println(false);
        }

        byte[] map = new byte[26];
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (map[ch - 'a'] > 0) {
                System.out.println(true);
            }
            map[ch - 'a']++;
        }
        System.out.println(true);
    }
}
